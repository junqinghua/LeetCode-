public class Binary_Tree_Level_Order_Traversal102 {
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
  //思路：BFS一层一层遍历，创建一个listlist用来存储每一层的节点
        List<List<Integer>> res  = new ArrayList<>();
        public List<List<Integer>> levelOrder(TreeNode root) {
            if(root ==null)return res;

            Queue<TreeNode> q = new LinkedList<>();

            q.offer(root);
            while(!q.isEmpty()){
                List<Integer> ls = new ArrayList<>();
                int level = q.size();
                while(level>0){
                    TreeNode node =q.poll();
                    ls.add(node.val);
                    if(node.left!=null){
                        q.offer(node.left);


                    }if(node.right!=null){
                        q.offer(node.right);
                    }
                    level--;
                }
                res.add(ls);

            }
            return res;
        }
    }

}
