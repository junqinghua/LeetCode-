import javax.swing.tree.TreeNode;

public class Delete_Node_in_a_BST450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val == key) {
            if (root.right == null) {
                return root.left;
            }
            if (root.left == null) {
                return root.right;
            }
            TreeNode temp = getmin(root.right);
            root.right = deleteNode(root.right, temp.val);
            temp.left = root.left;
            temp.right = root.right;
            root = temp;

        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }

    TreeNode getmin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }


}
