import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Binary search tree");
        printLine();

        BinarySearchTree binarySearchTree = new BinarySearchTree(50);
        System.out.println("Root node instance : " + binarySearchTree.getRoot());
        System.out.println("Root node default value : " + binarySearchTree.getRoot().getKey());

        printLine();
        
        binarySearchTree.add(30);
        binarySearchTree.add(20);
        binarySearchTree.add(40);
        binarySearchTree.add(70);
        binarySearchTree.add(60);
        binarySearchTree.add(80);

        Node node1 = binarySearchTree.search(binarySearchTree.getRoot(), 30);
        System.out.println(node1);
        System.out.println(node1.getKey());

        Node node2 = binarySearchTree.search(binarySearchTree.getRoot(), 80);
        System.out.println(node2);
        System.out.println(node2.getKey());

    }

    public static void printLine() {
        System.out.println("/*---------------------------------------------------------------------------------------------------*/");
    }

}
