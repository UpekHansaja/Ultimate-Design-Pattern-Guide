package structural.composite.java;

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

    public void addFilde(File file) {
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

    }

}
