public class MainApp {

    public static void main(String[] args) {

        System.out.println("Binary search tree");
        printLine();

        BinarySearchTree binarySearchTree = new BinarySearchTree(2);
        System.out.println("Root node instance : " + binarySearchTree.getRoot());
        System.out.println("Root node default value : " + binarySearchTree.getRoot().getSelf());
        System.out.println("Dept level : " + binarySearchTree.getTreeDept());

        printLine();

        binarySearchTree.add(1);
        System.out.println("Parent of left : " + binarySearchTree.getRoot().getLeft().getParent());
        System.out.println("Left of root : " + binarySearchTree.getRoot().getLeft().getSelf());
        System.out.println("Dept level : " + binarySearchTree.getTreeDept());

        binarySearchTree.add(3);
        System.out.println("Parent of right : " + binarySearchTree.getRoot().getRight().getParent());
        System.out.println("Right node default value : " + binarySearchTree.getRoot().getRight().getSelf());
        System.out.println("Dept level : " + binarySearchTree.getTreeDept());


    }

    public static void printLine() {
        System.out.println("/*---------------------------------------------------------------------------------------------------*/");
    }

}
