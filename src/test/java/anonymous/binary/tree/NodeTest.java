package anonymous.binary.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NodeTest {

    private Node node;

    @BeforeEach
    public void init() {
        node = new Node(null, 10);
    }

    @Test
    public void add_5_to_root_should_left_be_5() {

        node.addKey(5);
        Assertions.assertTrue(node.getLeft().getKey() == 5);

    }

    @Test
    public void add_15_to_root_should_right_be_15() {

        node.addKey(15);
        Assertions.assertTrue(node.getRight().getKey() == 15);

    }

    @Test
    public void get_parent_of_root_should_be_null() {
        Assertions.assertTrue(node.getParent() == null);
    }


}
