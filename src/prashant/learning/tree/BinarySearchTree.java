package prashant.learning.tree;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void traverseTreeInorder(Node node) {
        if(node == null) {
            return;
        }
        traverseTreeInorder(node.left);
        System.out.print(node.value + " ");
        traverseTreeInorder(node.right);


    }

    public void traverseTreePreorder(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node.value + " ");
        traverseTreePreorder(node.left);
        traverseTreePreorder(node.right);

    }

    public void traverseTreePostorder(Node node) {
        if(node == null) {
            return;
        }
        traverseTreePostorder(node.left);
        traverseTreePostorder(node.right);
        System.out.print(node.value + " ");

    }

    public void traverseTreeLevelorder(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node.value + " ");
        traverseTreeLevelorder(node.left);
        traverseTreeLevelorder(node.right);

    }

    void printPostorder() { traverseTreePostorder(root); }
    void printInorder() { traverseTreeInorder(root); }
    void printPreorder() { traverseTreePreorder(root); }
    void printLevelOrder() { traverseTreeLevelorder(root); }

}
