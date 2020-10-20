/*
    This is an O(n^2) solution to a breadth first traversal, because you need to reach each node twice to find the height and then to print the value
 */
public class TreeBreadthFirst {
    public static void main(String[] args) {
        Node root = new Node(null, null, 1);
        Node node2 = new Node(null, null,2);
        Node node3 = new Node(null, null, 3);
        Node node4 = new Node(null, null, 4);
        Node node5 = new Node(null, null, 5);
        Node node6 = new Node(null, null, 6);

        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node5.left = node6;

        int height = getHeight(root);

        for(int i = 1; i <= height; i++) {
            printBreadthFirst(root, i);
        }
    }
    public static int getHeight(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if(leftHeight>rightHeight) {
            return leftHeight+1;
        } else {
            return rightHeight+1;
        }
    }

    public static void printBreadthFirst(Node root, int level){
        if (root==null){
            return;
        }
        if (level == 1) {
            System.out.print(root.value);
        }
        if (level > 1) {
            printBreadthFirst(root.left, level-1);
            printBreadthFirst(root.right, level-1);
        }
    }
    
    
    public static class Node{
        Node left, right;
        int value;
        public Node(Node left, Node right, int value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }
    }
}
