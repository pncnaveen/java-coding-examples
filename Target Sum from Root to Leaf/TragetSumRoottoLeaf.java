/**
 * TragetSumRoottoLeaf
 */
public class TragetSumRoottoLeaf {

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

    // find sum
    public boolean targetsum(Node root, int sum, boolean isFound) {
        if (root == null && sum == 0) {
            isFound = true;
        } else if (root == null) {
            isFound = false;
        }
        isFound = targetsum(root.left, root.key - sum, isFound);
        isFound = targetsum(root.right, root.key - sum, isFound);
        return isFound;
    }

    public boolean targetSum(int sum) {
        return targetsum(root, sum, false);
    }

    public static void main(String[] args) {
        TragetSumRoottoLeaf tsl = new TragetSumRoottoLeaf();
        tsl.ins(204);
        tsl.ins(54);
        tsl.ins(554);
        tsl.ins(87);
    }
}