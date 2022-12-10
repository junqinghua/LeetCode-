import javax.swing.tree.TreeNode;

public class Convert_BST_to_Greater_Tree538 {
    //bst的中序遍历就是升序  如果改成先遍历右子树则变成降序
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }

    int sum = 0;
    void traverse(TreeNode root) {
        if (root == null) return;
        traverse(root.right);
        sum += root.val;
        root.val = sum;
        traverse(root.left);
    }

}