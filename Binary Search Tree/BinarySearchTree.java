/**
 * BinarySearchTree
 */
public class BinarySearchTree {

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

    // print the tree
    public void print(Node root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.println(root.key);
        print(root.right);
        return;
    }

    // print method
    public boolean print() {
        print(root);
        return true;
    }

    public static void main(String[] args) {
        BinarySearchTree bst1 = new BinarySearchTree();
        bst1.ins(10);
        bst1.ins(1);
        bst1.ins(6);
        bst1.ins(20);
        bst1.print();
        BinarySearchTree bst2 = new BinarySearchTree();
        bst2.ins(30);
        bst2.ins(11);
        bst2.ins(63);
        bst2.ins(0);
        bst2.print();
    }
}