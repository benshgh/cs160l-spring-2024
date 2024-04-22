package edu.sdsu.cs160l.BST;

class BST_class {
    // node class that defines BST node
    class Node {
        int key;
        Node left, right;

        public Node(int data) {
            key = data;
            left = right = null;
        }
    }

    // BST root node
    Node root;

    // Constructor for BST =>initial empty tree
    BST_class() {
        root = null;
    }

    // delete a node from BST
    void deleteKey(int key) {
        root = delete_Recursive(root, key);
    }

    // recursive delete function
    Node delete_Recursive(Node root, int key) {
        // tree is empty
        if (root == null) return root;

        // traverse the tree
        if (key < root.key) // traverse left subtree
            root.left = delete_Recursive(root.left, key);
        else if (key > root.key) // traverse right subtree
            root.right = delete_Recursive(root.right, key);
        else {
            // node contains only one child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node has two children;
            // get inorder successor (min value in the right subtree)
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = delete_Recursive(root.right, root.key);
        }
        return root;
    }

    int minValue(Node root) {
        // initially minval = root
        int minval = root.key;
        // find minval
        while (root.left != null) {
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }

    // insert a node in BST
    void insert(int key) {
        root = insert_Recursive(root, key);
    }


    Node insert_Recursive(Node root, int key) {
        // tree is empty
        if (root == null) {
            root = new Node(key);
            return root;
        }
        // traverse the tree
        if (key < root.key) // insert in the left subtree
            root.left = insert_Recursive(root.left, key);
        else if (key > root.key) // insert in the right subtree
            root.right = insert_Recursive(root.right, key);
        // return pointer
        return root;
    }

    // method for inorder traversal of BST
    void inorder() {
        inorder_Recursive(root);
    }

    // recursively traverse the BST
    void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            System.out.print(root.key + " ");
            inorder_Recursive(root.right);
        }
    }
    //PostOrder Traversal - Left:Right:rootNode (LRn)
    void postOrder(Node node)  {
        if (node == null)
            return;
        // first traverse left subtree recursively
        postOrder(node.left);
        // then traverse right subtree recursively
        postOrder(node.right);
        // now process root node
        System.out.print(node.key + " ");
    }

    //PreOrder Traversal - rootNode:Left:Right (nLR)
    void preOrder(Node node)  {
        if (node == null)
            return;
        //first print root node first
        System.out.print(node.key + " ");
        // then traverse left subtree recursively
        preOrder(node.left);
        // next traverse right subtree recursively
        preOrder(node.right);
    }

    boolean search(int key) {
        root = search_Recursive(root, key);
        return root != null;
    }

    // recursive search function
    Node search_Recursive(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null || root.key == key)
            return root;
        // val is greater than root's key
        if (root.key > key)
            return search_Recursive(root.left, key);
        // val is less than root's key
        return search_Recursive(root.right, key);
    }
    public static void main(String[] args) {
        // create a BST object
        BST_class bst = new BST_class();
        /* BST tree example
              45
           /     \
          10      90
         /  \    /
        7   12  50   */
        // insert data into BST
        bst.insert(45);
        bst.insert(10);
        bst.insert(7);
        bst.insert(12);
        bst.insert(90);
        bst.insert(50);
        // print the BST
        System.out.println("The BST Created with input data(Left-root-right):");
        bst.inorder();

        // delete leaf node
        System.out.println("\nThe BST after Delete 12(leaf node):");
        bst.deleteKey(12);
        bst.inorder();
        // delete the node with one child
        System.out.println("\nThe BST after Delete 90 (node with 1 child):");
        bst.deleteKey(90);
        bst.inorder();

        // delete node with two children
        System.out.println("\nThe BST after Delete 45 (Node with two children):");
        bst.deleteKey(45);
        bst.inorder();
        // search a key in the BST
        boolean ret_val = bst.search(50);
        System.out.println("\nKey 50 found in BST:" + ret_val);
        ret_val = bst.search(12);
        System.out.println("Key 12 found in BST:" + ret_val);
    }
}



