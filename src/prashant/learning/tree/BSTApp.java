package prashant.learning.tree;

public class BSTApp {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.root = new Node(1);
        binarySearchTree.root.left = new Node(2);
        binarySearchTree.root.right = new Node(3);
        binarySearchTree.root.left.left = new Node(4);
        binarySearchTree.root.left.right = new Node(5);
        binarySearchTree.root.right.left = new Node(6);
        binarySearchTree.root.right.right = new Node(7);

        binarySearchTree.printInorder();
        System.out.println("\n");

        binarySearchTree.printPreorder();
        System.out.println("\n");

        binarySearchTree.printPostorder();
        System.out.println("\n");
    }
}
