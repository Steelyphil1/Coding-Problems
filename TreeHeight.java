/*
    This is a solution to getting the height of the tree
 */
public class TreeHeight {

    public static void main (String[] args) {
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

        //Should print a height of 4
        System.out.println("The height of the tree is " + getHeight(root));

    }

    public static int getHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);

            if(leftHeight>rightHeight) {
                return leftHeight + 1;
            }else {
                return rightHeight + 1;
            }
        }
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
