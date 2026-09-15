
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> brr = new ArrayList<>();
        if(root==null)return brr;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> arr = new ArrayList<>();
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode temp = q.poll();
                arr.add(temp.val);

                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);
            }
            brr.add(arr);
        }
        return brr;
    }
}