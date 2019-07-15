import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Binary search tree");
        printLine();

        BinarySearchTree binarySearchTree = new BinarySearchTree(2);
        System.out.println("Root node instance : " + binarySearchTree.getRoot());
        System.out.println("Root node default value : " + binarySearchTree.getRoot().getKey());

        printLine();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter key for insert into tree : ");
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                break;
            } else if (command.equals("dept")) {
                System.out.println("Tree dept level : " + binarySearchTree.getTreeDept());
            } else {
                int key = Integer.parseInt(command);
                binarySearchTree.add(key);
                System.out.println("Added : " + key + " to tree");
            }
        }
    }

    public static void printLine() {
        System.out.println("/*---------------------------------------------------------------------------------------------------*/");
    }

}
