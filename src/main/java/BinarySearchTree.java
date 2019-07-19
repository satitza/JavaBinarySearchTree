public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(int key) {
        this.root = new Node(null, key);
    }

    public Node getRoot() {
        if (this.root != null && this.root.getParent() == null) {
            return this.root;
        }
        return null;
    }

    public void add(int key) {
        this.getRoot().addKey(key);
    }

    public Node search(Node node, int key) {
        if (node.getKey() == key) {
            return node;
        } else if (node.getKey() > key) {
            return this.search(node.getLeft(), key);
        } else {
            return this.search(node.getRight(), key);
        }
    }
}
