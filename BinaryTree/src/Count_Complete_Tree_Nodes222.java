import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Count_Complete_Tree_Nodes222 {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int res = 0;
        while (!q.isEmpty()) {
            List<Integer> ls = new ArrayList<>();
            int len = q.size();
            while (len > 0) {
                TreeNode node = q.poll();
                ls.add(node.val);
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
                len--;
            }

            res += ls.size();
        }
        return res;

    }
}
