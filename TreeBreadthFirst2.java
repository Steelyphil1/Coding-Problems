/*
    This is an O(n) solution to finding the Breadth first traversal of a tree using a queue
 */
import java.util.*;
public class TreeBreadthFirst2 {
    public static void main(String[] args) {
        Node root = new Node(null, null, 1);
        Node node2 = new Node(null,null,2);
        Node node3 = new Node(null,null,3);
        Node node4 = new Node(null,null,4);
        Node node5 = new Node(null,null,5);
        Node node6 = new Node(null,null,6);

        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node5.left = node6;

        System.out.println("The level order traversal of the tree is: ");
        printBreadthFirst(root);
    }
    public static void printBreadthFirst(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node tempNode = queue.poll();
            System.out.print(tempNode.value + " ");

            if(tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if(tempNode.right != null) {
                queue.add(tempNode.right);
            }
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
