/*
    Given the root to a binary tree, count the number of unival subtrees.
*/


public class Trees1_1 {

    public static void main (String[] args) {
        Node root = new Node(0, null, null);
        Node node1 = new Node(1,null,null);
        Node node2 = new Node(0,null,null);
        Node node3 = new Node(1,null,null);
        Node node4 = new Node(0,null,null);
        Node node5 = new Node(1,null,null);
        Node node6 = new Node(1,null,null);

        root.setLeft(node1);
        root.setRight(node2);
        node2.setLeft(node3);
        node2.setRight(node4);
        node3.setLeft(node5);
        node3.setRight(node6);

        System.out.println(countUnival(root));
        System.out.println(countUnival(node3));
    }
    public static int countUnival(Trees1_1.Node root) {
        if(root == null) {
            return 0;
        }
        int count = countUnival(root.left) + countUnival(root.right);
        if(isUnival(root)) {
            count += 1;
        }
        return count;
    }
    public static boolean isUnival(Trees1_1.Node root) {
        if(root.left == null && root.right == null) {
            return true;
        }
        if(root.left != null && root.left.value != root.value) {
            return false;
        }
        if(root.right != null && root.right.value != root.value) {
            return false;
        }
        if(isUnival(root.left) && isUnival(root.right)) {
            return true;
        }
        return false;
    }

    public static class Node {
        private int value;
        private Node left;
        private Node right;
        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
        public Node getLeft() {
            return this.left;
        }
        public Node getRight() {
            return this.right;
        }
        public void setLeft(Node n) {
            this.left = n;
        }
        public void setRight(Node n) {
            this.right = n;
        }
    }
}