package datastructures.treesandgraphs;

class ValidateBST {

    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static boolean isBST(Node root, long min, long max) {
        if (root == null) return true;
        if (root.data <= min || root.data >= max) return false;
        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);

        System.out.println(isBST(root, Long.MIN_VALUE, Long.MAX_VALUE));
    }
}