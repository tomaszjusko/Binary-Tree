package pl.java.bootcamp.binarytree;

public class Tree {

        private Node root;

        public void add(int value) {
            root = addRecursive(root, value);
        }

        private Node addRecursive(Node current, int value) {
            if (current == null) {
                return new Node(value);
            }

            if (value < current.value) {
                current.left = addRecursive(current.left, value);
            } else if (value > current.value) {
                current.right = addRecursive(current.right, value);
            }

            return current;
        }

        public boolean contains(int value) {
            return containsRecursive(root, value);
        }

        private boolean containsRecursive(Node current, int value) {
            if (current == null) {

                return false;
            }

            if (value == current.value) {
                return true;
            }

            if (value < current.value) {
                return containsRecursive(current.left, value);
            } else {
                return containsRecursive(current.right, value);
            }
        }

        public int max() {
            if (root == null) {
                throw new IllegalStateException("Tree is empty");
            }

            return findMax(root);
        }

        private int findMax(Node node) {
            if (node.right == null) {
                return node.value;
            }

            return findMax(node.right);
        }

        public int min() {
            if (root == null) {
                throw new IllegalStateException("Tree is empty");
            }

            return findMin(root);
        }

        private int findMin(Node node) {
            if (node.left == null) {
                return node.value;
            }

            return findMin(node.left);
        }
    }