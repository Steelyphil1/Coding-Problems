/*
    This prints the preorder, inorder, and postorder traversal of the tree
 */
public class TreeTraversals {
    public static void main(String[] args) {
        Node root = new Node(null,null,1);
        Node node2 = new Node(null,null,2);
        Node node3 = new Node(null,null,3);
        Node node4 = new Node(null,null,4);
        Node node5 = new Node(null,null,5);
        Node node6 = new Node(null,null,6);

        root.left=node2;
        root.right=node3;
        node2.left=node4;
        node2.right=node5;
        node5.left=node6;

        System.out.println("PreOrder:");
        printPreOrder(root);
        System.out.println(" ");
        System.out.println("InOrder");
        printInOrder(root);
        System.out.println(" ");
        System.out.println("PostOrder");
        printPostOrder(root);
    }
    public static void printPreOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.value + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    public static void printInOrder(Node root) {
        if(root == null){
            return;
        }
        printInOrder(root.left);
        System.out.print(root.value + " ");
        printInOrder(root.right);
    }
    public static void printPostOrder(Node root) {
        if(root==null) {
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.value + " ");
    }

    public static class Node {
        Node left, right;
        int value;
        public Node(Node left, Node right, int value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }
    }
}
