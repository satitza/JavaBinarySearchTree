package anonymous.binary.tree.tree;

public class Node {

    private Node parent;
    private Node left;
    private Node right;

    private int key;

    public Node(Node parent, int key) {
        this.parent = parent;
        this.key = key;
    }

    public Node getParent() {
        if (this.parent != null) {
            return this.parent;
        }
        return null;
    }

    private void addLeft(int key) {
        this.left = new Node(this, key);
    }

    public Node getLeft() {
        if (this.left != null) {
            return this.left;
        }
        return null;
    }

    private void addRight(int key) {
        this.right = new Node(this, key);

    }

    public Node getRight() {
        if (this.right != null) {
            return this.right;
        }
        return null;
    }

    public void addKey(int key) {
        if (key != this.key) {
            if (key < this.key) {
                if (this.getLeft() != null) {
                    this.getLeft().addKey(key);
                } else {
                    this.addLeft(key);
                }
            } else {
                if (this.getRight() != null) {
                    this.getRight().addKey(key);
                } else {
                    this.addRight(key);
                }
            }
        }
    }

    public int getKey() {
        return this.key;
    }

}
