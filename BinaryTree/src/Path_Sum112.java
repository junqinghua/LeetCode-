import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class Path_Sum112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
//bfs 永远的神
        if (root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> qval = new LinkedList<>();
        q.offer(root);
        qval.offer(root.val);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            int nodeval = qval.poll();
            if (node.left == null && node.right == null) {
                if (nodeval == targetSum) {
                    return true;

                }
                continue;
            }
            if (node.left != null) {
                q.offer(node.left);
                qval.offer(node.left.val + nodeval);
            }
            if (node.right != null) {
                q.offer(node.right);
                qval.offer(node.right.val + nodeval);
            }


        }
        return false;

    }
}