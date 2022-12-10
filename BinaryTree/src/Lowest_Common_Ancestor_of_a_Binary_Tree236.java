import javax.swing.tree.TreeNode;

public class Lowest_Common_Ancestor_of_a_Binary_Tree236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null || root.val==p.val||root.val ==q.val){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if (left==null && right == null){
            return null;
        }
        else if(left == null && right!=null){
            return right;

        } else if (left!=null && right ==null) {
            return left;

        }else {
            return root;
        }


    }
}
