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

    public int addLeft(int key) {
        this.left = new Node(this, key, this.dept + 1);
        return this.dept + checkDept(this.left);
    }

    public Node getLeft() {
        if (this.left != null) {
            return this.left;
        }
        return null;
    }

    public int addRight(int key) {
        this.right = new Node(this, key, this.dept + 1);
        return this.dept + checkDept(this.right);
    }

    public Node getRight() {
        if (this.right != null) {
            return this.right;
        }
        return null;
    }

    public int addKey(int key) {
        if (key != this.key) {
            if (key < this.key) {
                return this.dept = this.addLeft(key);
            } else {
                return this.dept = this.addRight(key);
            }
        }
        return 0;
    }

    public int checkDept(Node node) {
        if (node.getParent() == this && node.getDept() == this.key + 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public int getKey() {
        return this.key;
    }

    public int getDept() {
        return this.dept;
    }
}
