import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;

public class Same_Tree100 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    List ls1 = new LinkedList<>();
    List ls2 = new LinkedList<>();

    //dfs两组树并添加到ls里，比较两个ls
    public boolean isSameTree(TreeNode p, TreeNode q) {

        dfs(p, ls1);
        dfs(q, ls2);
        if (ls1.equals(ls2)) {
            return true;
        } else {
            return false;
        }

    }

    void dfs(TreeNode node, List ls) {
        if (node == null) {
            ls.add("null");
            return;
        }

        ls.add(node.val);
        dfs(node.left, ls);
        dfs(node.right, ls);
    }
}