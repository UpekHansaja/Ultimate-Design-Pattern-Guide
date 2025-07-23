import java.util.ArrayList;
import java.util.List;

interface FileSystemComponent {
    void showDetails(String indent);
}

class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "File: " + name);
    }
}

class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components;

    public Folder(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails(String indent){
        System.out.println(indent + "Folder: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails(indent + "  ");
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

        rootFolder.addComponent(file1);
        rootFolder.addComponent(subFolder1);
        subFolder1.addComponent(file2);
        subFolder1.addComponent(subFolder2);
        subFolder2.addComponent(file3);

        rootFolder.showDetails("");

    }

}
