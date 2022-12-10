import javax.swing.tree.TreeNode;
import java.time.temporal.Temporal;
import java.util.LinkedList;
import java.util.Queue;

public class Merge_Two_BInary_Trees617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root1);
        q.offer(root2);
        while (!q.isEmpty()) {
            TreeNode node1 = q.poll();
            TreeNode node2 = q.poll();
            node1.val += node2.val;
            if (node1.left != null && node2.left != null) {
                q.offer(node1.left);
                q.offer(node2.left);
            }
            if (node1.right != null && node2.right != null) {
                q.offer(node12.right);
            }
            if (node1.left == null) {
                node1.left = node2.left;
            }
            if (node1.right == null) {
                node1.right = node2.right;
            }


        }
        return root1;

    }

}
