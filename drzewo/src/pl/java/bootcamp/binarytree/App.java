package pl.java.bootcamp.binarytree;

public class App {
    public static void main(String[] args) {
        TreeTool treeTool = new TreeTool();

        treeTool.addElement(5);
        treeTool.addElement(10);
        treeTool.addElement(3);
        treeTool.addElement(6);

        treeTool.displayMax();
        treeTool.displayMin();
        treeTool.checkElement(6);
        treeTool.checkElement(11);
    }
}
