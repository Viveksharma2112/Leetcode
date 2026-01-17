class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {

        // base case
        if (root == null) {
            return null;
        }

        // search phase
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else {

            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            int successor = findMin(root.right);
            root.val = successor;
            root.right = deleteNode(root.right, successor);
        }

        return root;
    }

  private int findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.val;
    }
}
