public class Node {

    private Node parent;
    private Node left;
    private Node right;

    private int key;
    private int dept;

    public Node(Node parent, int key, int dept) {
        this.parent = parent;
        this.key = key;
        this.dept = dept;
    }

    public Node getParent() {
        if (this.parent != null) {
            return this.parent;
        }
        return null;
    }

    public void addLeft(int key) {
        this.left = new Node(this, key, this.dept + 1);
    }

    public Node getLeft() {
        if (this.left != null) {
            return this.left;
        }
        return null;
    }

    public void addRight(int key) {
        this.right = new Node(this, key, this.dept + 1);

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

    // get dept for child object WTF how do it ?
    public int getDept() {
        return this.dept;
    }
}
