import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Binary search tree");
        printLine();

        BinarySearchTree binarySearchTree = new BinarySearchTree(2);
        System.out.println("Root node instance : " + binarySearchTree.getRoot());
        System.out.println("Root node default value : " + binarySearchTree.getRoot().getKey());

        System.out.println("Dept level : " + binarySearchTree.getTreeDept());
        printLine();

        binarySearchTree.getRoot().addKey(1);
        System.out.println("Parent of left : " + binarySearchTree.getRoot().getLeft().getParent());
        System.out.println("Left of root : " + binarySearchTree.getRoot().getLeft().getKey());

        binarySearchTree.getRoot().addKey(3);
        System.out.println("Parent of right : " + binarySearchTree.getRoot().getRight().getParent());
        System.out.println("Right of root : " + binarySearchTree.getRoot().getRight().getKey());

        System.out.println("Dept level : " + binarySearchTree.getTreeDept());
        printLine();

        binarySearchTree.getRoot().getLeft().addKey(0);
        System.out.println("Parent of left of left : " + binarySearchTree.getRoot().getLeft().getLeft().getParent());
        System.out.println("Left of left of root : " + binarySearchTree.getRoot().getLeft().getLeft().getKey());
        System.out.println("Left dept level : " + binarySearchTree.getRoot().getLeft().getDept());

        binarySearchTree.getRoot().getRight().addKey(4);
        System.out.println("Parent of right of right : " + binarySearchTree.getRoot().getRight().getRight().getParent());
        System.out.println("Right of right of root : " + binarySearchTree.getRoot().getRight().getRight().getKey());
        System.out.println("Right dept level : " + binarySearchTree.getRoot().getRight().getDept());

    }

    public static void printLine() {
        System.out.println("/*---------------------------------------------------------------------------------------------------*/");
    }

}
