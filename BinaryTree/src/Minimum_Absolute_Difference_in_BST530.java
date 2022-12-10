import javax.swing.tree.TreeNode;

public class Minimum_Absolute_Difference_in_BST530 {
    /**
     * 本题两种解法：1.先利用bst中序遍历特征 将遍历存入数组 再在数组中找两个元素间最小绝对差
     * 2. 在中序遍历时用pre记录treenode 直接 获取当前node-prenode的值
     */
    int res = Integer.MAX_VALUE;
    TreeNode pre;
    public int getMinimumDifference(TreeNode root) {

        Trasverse(root);
        return res;
    }

    void Trasverse(TreeNode root ){
        if(root == null) return;
        Trasverse(root.left);
        if(pre!=null){
            res = Math.min(res, root.val-pre.val);
        }
        pre = root;
        Trasverse(root.right);

    }

}




}
