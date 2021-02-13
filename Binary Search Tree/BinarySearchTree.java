
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

    // find leaf value in a tree
    public int findLeaf(Node root) {
        if (root.left == null) {
            return root.key;
        }
        return findLeaf(root.left);
    }

    // insert in tree
    public Node insert(Node root, int key) {

        if (root == null) {
            Node newnode = new Node(key);
            root = newnode;
        } else if (root.key == key) {
            System.out.println("duplicate element");
            return root;
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
    public boolean print(String obj) {
        System.out.println(obj);
        print(root);
        return true;
    }

    // deleting a key in tree
    public Node delete(Node root, int key) {
        if (root == null) {
            System.out.println("element not found");
            return root;
        } else if (root.key == key) {
            if (root.left == null && root.right == null)
                return null;
            else if (root.left != null && root.right == null)
                return root.left;
            else if (root.left == null && root.right != null)
                return root.right;
            else if (root.left != null && root.right != null) {
                root.key = findLeaf(root.right);
                root.right = delete(root.right, root.key);
                return root;
            }
        } else {
            if (key > root.key)
                root.right = delete(root.right, key);
            else
                root.left = delete(root.left, key);
        }
        return root;
    }

    // delete method
    public boolean delete(int key) {
        root = delete(root, key);
        return true;
    }

    public static void main(String[] args) {
        BinarySearchTree bst1 = new BinarySearchTree();
        bst1.ins(10);
        bst1.ins(-1);
        bst1.ins(6);
        bst1.ins(20);
        bst1.ins(15);
        bst1.ins(45);
        bst1.ins(30);
        bst1.ins(47);
        bst1.print("bst1");
        bst1.delete(20);
        bst1.print("bst1");
        // BinarySearchTree bst2 = new BinarySearchTree();
        // bst2.ins(30);
        // bst2.ins(11);
        // bst2.ins(63);
        // bst2.ins(0);
        // bst2.print("bst2");
    }
}