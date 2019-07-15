public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(int key) {
        this.root = new Node(null, key, 1);
    }

    public Node getRoot() {
        if (this.root != null && this.root.getParent() == null) {
            return this.root;
        }
        return null;
    }

    public int getTreeDept() {
        if (this.root.getDept() >= 1) {
            return this.root.getDept();
        }
        return 0;
    }

    public void add(int key) {
        this.getRoot().addKey(key);
    }

}
