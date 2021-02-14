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
    public boolean targetsum(Node root, int sum) {
        if (root == null && sum == 0) {
            return true;
        } else if (root == null) {
            return false;
        }
        if (!targetsum(root.left, sum - root.key) && !targetsum(root.right, sum - root.key)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean targetSum(int sum) {
        return targetsum(root, sum);
    }

    public static void main(String[] args) {
        TragetSumRoottoLeaf tsl = new TragetSumRoottoLeaf();
        tsl.ins(10);
        tsl.ins(5);
        tsl.ins(17);
        tsl.ins(1);
        System.out.println(tsl.targetSum(27));

    }
}