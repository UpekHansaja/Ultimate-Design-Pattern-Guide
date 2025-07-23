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

        Folder root = new Folder("Root");

        FileSystemComponent photo = new File("photo.jpg");
        FileSystemComponent photo2 = new File("photo2.jpg");
        FileSystemComponent document = new File("document.txt");
        FileSystemComponent document2 = new File("document2.txt");
        FileSystemComponent song = new File("song.mp3");
        FileSystemComponent video = new File("video.mp4");

        Folder documents = new Folder("Documents");
        documents.addComponent(document);
        documents.addComponent(document2);

        Folder media = new Folder("Media");
        Folder photos = new Folder("Photos");
        Folder videos = new Folder("Videos");
        Folder music = new Folder("Music");

        media.addComponent(photos);
        media.addComponent(videos);
        media.addComponent(music);

        photos.addComponent(photo);
        photos.addComponent(photo2);
        videos.addComponent(video);
        music.addComponent(song);

        root.addComponent(documents);
        root.addComponent(media);

        root.showDetails("");

    }

}
