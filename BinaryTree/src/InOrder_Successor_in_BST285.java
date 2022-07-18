public class InOrder_Successor_in_BST285 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    //巧用bst的特点（右永远>左）解决这道题
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode successor = null;
        //若p大于根结点则可直接舍弃整个左子树（在bst中为必然情况）
        while(root!=null){
            //持续向右移动直到找一个比p大的节点，该节点就是候选successor
            if(p.val>=root.val){
                root = root.right;
            }else {
                successor = root;
                //left为空，退出循环
                root = root.left;
            }
        }
        return successor;
    }
}


