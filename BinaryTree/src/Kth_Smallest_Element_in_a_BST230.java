public class Kth_Smallest_Element_in_a_BST230 {
    public int kthSmallest(TreeNode root, int k) {
        tresverse(root, k);
        return res;
    }

    int rank = 0;
    int res = 0;

    void tresverse(TreeNode root, int k) {
        if (root == null) return;
        tresverse(root.left, k);
        rank++;
        if (rank == k) {
            res = root.val;
            return;
        }
        tresverse(root.right, k);
    }
}
}
