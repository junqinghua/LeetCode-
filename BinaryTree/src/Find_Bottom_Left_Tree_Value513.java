import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class Find_Bottom_Left_Tree_Value513 {
    public int findBottomLeftValue(TreeNode root) {
        //bfs
        if (root == null) return 0;
        int res = root.val;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            while (len > 0) {
                TreeNode node = q.poll();

                if (node.right != null) {
                    q.offer(node.right);
                }
                if (node.left != null) {
                    q.offer(node.left);
                }
                len--;
                res = node.val;
            }

        }

        return res;
    }

}
