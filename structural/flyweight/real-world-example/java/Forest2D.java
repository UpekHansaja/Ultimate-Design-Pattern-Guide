import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface DrawableTree {
    void draw(int x, int y);
}

class TreeType implements DrawableTree {
    private String type;
    private String color;
    private String texture;

    public TreeType(String type, String color, String texture) {
        this.type = type;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println(
                "Drawing " + type + " tree at (" + x + ", " + y + ") with color " + color + " and texture " + texture);
    }
}

class TreeFactory {

    private static final Map<String, DrawableTree> treeTypes = new HashMap<>();

    public static DrawableTree getTreeType(String type, String color, String texture) {
        String key = type + "-" + color + "-" + texture;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(type, color, texture));
        }
        return treeTypes.get(key);
    }

    public static int getTotalTypes() {
        return treeTypes.size();
    }

}

class Tree {
    private int x;
    private int y;
    private DrawableTree treeType;

    public Tree(int x, int y, DrawableTree treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw() {
        treeType.draw(x, y);
    }
}

class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String type, String color, String texture) {
        DrawableTree treeType = TreeFactory.getTreeType(type, color, texture);
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
    }

    public void draw() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }

    public int getTreeCount() {
        return trees.size();
    }
}

public class Forest2D {

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

    public static void main(String[] args) {

        Forest forest = new Forest();

        for(int i = 0; i < 10; i++) {
            forest.plantTree(getRandomX(), getRandomY(), "Oak", "Green", "Rough");
            forest.plantTree(getRandomX(), getRandomY(), "Pine", "Dark Green", "Smooth");
            forest.plantTree(getRandomX(), getRandomY(), "Birch", "Light Brown", "Bark");
        }

        forest.draw();

        System.out.println("Total tree types created: " + TreeFactory.getTotalTypes());
        System.out.println("Total trees in the forest: " + forest.getTreeCount());
    }
}
