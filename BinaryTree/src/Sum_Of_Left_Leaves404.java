import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class Sum_Of_Left_Leaves404 {
    public int sumofLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int res = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            while (len > 0) {
                TreeNode node = q.poll();
                if (node.left != null) {
                    q.offer(node.left);
                    if (node.left.left == null && node.left.right == null) {
                        res += node.left.val;
                    }

                }
                if (node.right != null) {
                    q.offer(node.right);
                }
                len--;
            }
        }
        return res;
    }
}
