package pl.java.bootcamp.binarytree;

class TreeTool {
    private Tree tree;

    public TreeTool() {
        this.tree = new Tree();
    }

    public void addElement(int value) {
        tree.add(value);
    }

    public void checkElement (int value){
        if (tree.contains(value)){
            System.out.println("Liczba znajduje sie w drzewie");
        }else {
            System.out.println("Liczba nie znajduje sie w drzewie");
        }

    }

    public void displayMax() {
        try {
            int max = tree.max();
            System.out.println("Największa wartość w drzewie: " + max);
        } catch (IllegalStateException e) {
            System.out.println("Drzewo jest puste. Brak maksymalnej wartości.");
        }
    }

    public void displayMin() {
        try {
            int min = tree.min();
            System.out.println("Najmniejsza wartość w drzewie: " + min);
        } catch (IllegalStateException e) {
            System.out.println("Drzewo jest puste. Brak minimalnej wartości.");
        }
    }
}