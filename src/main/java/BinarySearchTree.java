public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(int value) {
        this.root = new Node(null, value, 1);
    }

    public void add(int value) {
        this.getRoot().addValue(value);
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

}
