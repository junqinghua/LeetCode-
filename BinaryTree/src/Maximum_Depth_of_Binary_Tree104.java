import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Maximum_Depth_of_Binary_Tree104 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
        public int maxDepth(TreeNode root) {
            //思路：BFS广度优先，每一层遍历完后level+1，记录level 最后返回
            if(root == null) return 0;
            int level =0;
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()){

                List<Integer> ls = new ArrayList<>();

                int len = q.size();
                while(len>0){
                    TreeNode node =q.poll();
                    ls.add(node.val);
                    if(node.left!=null){
                        q.offer(node.left);
                    }
                    if(node.right!=null){
                        q.offer(node.right);
                    }
                    len--;
                }
                level++;

            }
            return level;

        }
    }

