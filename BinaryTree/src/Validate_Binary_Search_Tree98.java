import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Validate_Binary_Search_Tree98 {
    List<Integer> ls = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        traverse(root);
        for (int i = 1; i < ls.size(); i++) {
            if (ls.get(i) <= ls.get(i - 1)) {
                return false;
            }
        }
        return true;

    }

    void traverse(TreeNode root) {
        if (root == null) return;
        traverse(root.left);
        ls.add(root.val);
        traverse(root.right);
    }

}
