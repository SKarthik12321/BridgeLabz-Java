package datastructures.treesandgraphs;

class BinaryTreeDiameter {

    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static int diameter = 0;

    static int height(Node root) {
        if (root == null) return 0;
        int l = height(root.left);
        int r = height(root.right);
        diameter = Math.max(diameter, l + r);
        return 1 + Math.max(l, r);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        height(root);
        System.out.println(diameter);
    }
}