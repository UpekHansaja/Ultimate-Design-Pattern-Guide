import java.util.ArrayList;
import java.util.List;

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

class Page implements DocumentElements {
    private String name;
    private List<DocumentElements> elements = new ArrayList<>();

    public Page(String name) {
        this.name = name;
    }

    public void addElement(DocumentElements element) {
        elements.add(element);
    }

    public void removeElement(DocumentElements element) {
        elements.remove(element);
    }

    @Override
    public void render() {
        System.out.println("Rendering page: " + name);
        for (DocumentElements element : elements) {
            element.render();
        }
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving page: " + name + " to (" + x + ", " + y + ")");
        for (DocumentElements element : elements) {
            element.move(x, y);
        }
    }

    @Override
    public void resize(double factor) {
        System.out.println("Resizing page: " + name + " by factor " + factor);
        for (DocumentElements element : elements) {
            element.resize(factor);
        }
    }
}

class Chart implements DocumentElements {
    private String title;

    public Chart(String title) {
        this.title = title;

        try {

            // Simulating some initialization that might throw an exception
            if (title == null || title.isEmpty()) {
                throw new IllegalArgumentException("Chart title cannot be null or empty");
            }
            System.out.println("Chart created with title: " + title);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void render() {
        System.out.println("Rendering Chart: " + title);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving Chart: " + title + " to (" + x + ", " + y + ")");
    }

    @Override
    public void resize(double factor) {
        System.out.println("Resizing Chart: " + title + " by factor " + factor);
    }
}

public class EditDocsApp {

    public static void main(String[] args) {

        DocumentElements textBox1 = new TextBox(10, 20, 1.5);
        DocumentElements textBox2 = new TextBox(30, 40, 2.0);

        DocumentElements chart = new Chart("Sales Data");
        chart.render();

        Page page1 = new Page("Introduction");
        page1.addElement(textBox1);
        page1.addElement(textBox2);
        page1.addElement(chart);

        page1.render();
        page1.move(5, 10);
        page1.resize(1.2);

    }

}
