import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Find_Mode_in_Binary_Search_Tree501 {
    int count;
    int maxcount;
    List<Integer> ls;
    TreeNode pre;

    public int[] findMode(TreeNode root) {
        count = 0;
        maxcount = 0;
        ls = new ArrayList<>();
        pre = null;
        findmode1(root);
        int[] res = new int[ls.size()];
        for (int i = 0; i < ls.size(); i++) {
            res[i] = ls.get(i);
        }
        return res;
    }


    void findmode1(TreeNode root) {
        if (root == null) return;

        findmode1(root.left);
        int rootval = root.val;
        if (pre == null || pre.val != rootval) {
            count = 1;
        } else {
            count++;
        }
        if (count > maxcount) {
            ls.clear();
            ls.add(rootval);
            maxcount = count;
        } else if (count == maxcount) {
            ls.add(rootval);
        }
        pre = root;
        findmode1(root.right);
    }
}
