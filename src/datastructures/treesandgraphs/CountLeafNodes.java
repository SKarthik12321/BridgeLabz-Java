package datastructures.treesandgraphs;

class CountLeafNodes {

    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static int countLeaves(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return countLeaves(root.left) + countLeaves(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        System.out.println(countLeaves(root));
    }
}