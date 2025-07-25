
interface DocumentElements {

    void render();
    void move(int x, int y);
    void resize(double factor);
    
}

class TextBox implements DocumentElements {
    private int x;
    private int y;
    private double size;

    public TextBox(int x, int y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    @Override
    public void render() {
        System.out.println("Rendering TextBox at (" + x + ", " + y + ") with size " + size);
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Moved TextBox to (" + x + ", " + y + ")");
    }

    @Override
    public void resize(double factor) {
        this.size *= factor;
        System.out.println("Resized TextBox to size " + size);
    }
}

public class EditDocsApp {

    public static void main(String[] args) {
        
    }
    
}
