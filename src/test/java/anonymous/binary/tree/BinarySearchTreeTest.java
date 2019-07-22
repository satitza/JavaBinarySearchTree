package anonymous.binary.tree;

import anonymous.binary.exception.NodeNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Binary search tree test")
public class BinarySearchTreeTest {

    BinarySearchTree binarySearchTree;

    @BeforeEach
    public void init() {
        binarySearchTree = new BinarySearchTree(10);
    }

    @Test
    public void get_root_node_when_tree_created() {
        try {

            Node root = binarySearchTree.getRoot();
            Assertions.assertTrue(binarySearchTree.getRoot() == root);

        } catch (NodeNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Test
    public void test_search_key_from_tree() {

        binarySearchTree.add(30);
        binarySearchTree.add(20);
        binarySearchTree.add(40);
        binarySearchTree.add(70);
        binarySearchTree.add(60);
        binarySearchTree.add(80);

        try {
            Assertions.assertTrue(binarySearchTree.search(this.binarySearchTree.getRoot(), 60).getKey() == 60);
        } catch (NodeNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
