/**
 * MinDepthTree
 */
public class MinDepthTree {
    /**
     * Node
     */
    public class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    Node root = null;

    // insert in tree
    public Node insert(Node root, int key) {
        if (root == null) {
            Node newnode = new Node(key);
            root = newnode;
        } else {
            if (key > root.key) {
                root.right = insert(root.right, key);
            } else {
                root.left = insert(root.left, key);
            }
        }
        return root;
    }

    // insert method
    public boolean ins(int key) {
        root = insert(root, key);
        return true;
    }

    // find min depth of the tree
    public int depth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.right == null && root.left == null) {
            return 1;
        }
        if (root.right != null && root.left == null) {
            return 1 + depth(root.right);
        }
        if (root.left != null && root.right == null) {
            return 1 + depth(root.left);
        } else {
            int lftdep = 1 + depth(root.left);
            int rgtdep = 1 + depth(root.right);
            return lftdep <= rgtdep ? lftdep : rgtdep;
        }
    }

    public int depth() {
        return depth(root);
    }

    public static void main(String[] args) {
        MinDepthTree mdt = new MinDepthTree();
        mdt.ins(10);
        mdt.ins(6);
        mdt.ins(11);
        mdt.ins(12);
        mdt.ins(20);
        mdt.ins(4);
        mdt.ins(7);
        mdt.ins(13);
        System.out.println(mdt.depth());
    }
}