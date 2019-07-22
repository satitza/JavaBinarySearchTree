package anonymous.binary.tree;

import anonymous.binary.exception.NodeNotFoundException;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(int key) {
        this.root = new Node(null, key);
    }

    public Node getRoot() throws NodeNotFoundException {
        if (this.root != null && this.root.getParent() == null) {
            return this.root;
        } else {
            throw new NodeNotFoundException("Cannot get root node from this tree.");
        }
    }

    public void add(int key) {
        try {
            this.getRoot().addKey(key);
        } catch (NodeNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Node search(Node node, int key) throws NodeNotFoundException {
        if (node.getKey() == key) {
            return node;
        } else if (node.getKey() > key) {
            if (node.getLeft() == null) {
                throw new NodeNotFoundException("Node not found!. for search key " + key + " in node.");
            } else {
                return this.search(node.getLeft(), key);
            }
        } else {
            if (node.getRight() == null) {
                throw new NodeNotFoundException("Node not found!. for search key " + key + " in node.");
            } else {
                return this.search(node.getRight(), key);
            }
        }
    }

}
