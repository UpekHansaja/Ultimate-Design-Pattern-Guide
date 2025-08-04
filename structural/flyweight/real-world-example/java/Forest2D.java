import java.util.ArrayList;
import java.util.List;

class Tree {
    private String type;
    private String color;
    private String texture;
    private int x;
    private int y;

    public Tree(String type, String color, String texture, int x, int y) {
        this.type = type;
        this.color = color;
        this.texture = texture;
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println(
                "Drawing " + type + " tree at (" + x + ", " + y + ") with color " + color + " and texture " + texture);
    }

}

class RenderForest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(String type, String color, String texture, int x, int y) {
        Tree tree = new Tree(type, color, texture, x, y);
        trees.add(tree);
    }

    public void drawForest() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}

public class Forest2D {

    private static int getRandomX() {
        return (int) (Math.random() * 10000);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 10000);
    }

    public static void main(String[] args) {

        RenderForest forest = new RenderForest();

        for (int i = 0; i < 10; i++) {
            String type = "Oak";
            String color = "Green";
            String texture = "Rough";
            forest.plantTree(type, color, texture, getRandomX(), getRandomY());
        }

        for (int i = 0; i < 10; i++) {
            String type = "Pine";
            String color = "Dark Green";
            String texture = "Smooth";
            forest.plantTree(type, color, texture, getRandomX(), getRandomY());
        }

        for (int i = 0; i < 10; i++) {
            String type = "Birch";
            String color = "White";
            String texture = "Bark";
            forest.plantTree(type, color, texture, getRandomX(), getRandomY());
        }

        forest.drawForest();

    }
}
