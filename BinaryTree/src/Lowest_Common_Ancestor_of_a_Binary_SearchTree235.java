import javax.swing.tree.TreeNode;

public class Lowest_Common_Ancestor_of_a_Binary_SearchTree235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if (root.val>p.val && root.val>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if (root.val<p.val && root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }

        return root;
    }
}
