import java.util.ArrayList;
import java.util.List;

class File {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void open() {
        System.out.println("Opening file: " + fileName);
    }
}

class Folder {

    private String folderName;
    private List<File> files = new ArrayList<>();
    private List<Folder> subFolders = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void openAll() {
        System.out.println("Opening folder: " + folderName);
        for (File file : files) {
            file.open();
        }
        for (Folder folder : subFolders) {
            folder.openAll();
        }
    }

}

public class Composite {

    public static void main(String[] args) {

        Folder rootFolder = new Folder("root");
        Folder subFolder1 = new Folder("subFolder1");
        Folder subFolder2 = new Folder("subFolder2");

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        rootFolder.addFile(file1);
        rootFolder.addFolder(subFolder1);
        subFolder1.addFile(file2);
        subFolder1.addFolder(subFolder2);
        subFolder2.addFile(file3);

        rootFolder.openAll();

    }

}
