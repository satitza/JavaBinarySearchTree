public class Node {

    private Node parent;
    private Node left;
    private Node right;

    private int self;
    private int dept;

    public Node(Node parent, int value, int dept) {
        this.parent = parent;
        this.self = value;
        this.dept = dept;
    }

    public Node getParent() {
        if (this.parent != null) {
            return this.parent;
        }
        return null;
    }

    public int addLeft(int value) {
        this.left = new Node(this, value, this.dept + 1);
        return this.dept + checkDept(this.left);
    }

    public Node getLeft() {
        if (this.left != null) {
            return this.left;
        }
        return null;
    }

    public int addRight(int value) {
        this.right = new Node(this, value, this.dept + 1);
        return this.dept + checkDept(this.right);
    }

    public Node getRight() {
        if (this.right != null) {
            return this.right;
        }
        return null;
    }

    public int addValue(int value) {
        if (value != this.self) {
            if (value < this.self) {
                return this.dept = this.addLeft(value);
            } else {
                return this.dept = this.addRight(value);
            }
        }
        return 0;
    }

    public int checkDept(Node node) {
        if (node.getParent() == this && node.getDept() == this.self + 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public int getSelf() {
        return this.self;
    }

    public int getDept() {
        return this.dept;
    }
}
