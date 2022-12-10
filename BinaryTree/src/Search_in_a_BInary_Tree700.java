import javax.swing.tree.TreeNode;

public class Search_in_a_BInary_Tree700 {
    public TreeNode searchBST(TreeNode root, int val) {
        //利用bst特性 不用搜索整棵树
        while (root != null) {
            if (val > root.val) {
                root = root.right;

            } else if (val < root.val) {
                root = root.left;
            } else return root;
        }
        return null;

    }
}
