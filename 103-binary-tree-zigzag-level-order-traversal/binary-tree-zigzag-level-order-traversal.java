
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> brr = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
       
        q.offer(root);
        if (root == null)
            return brr;
        boolean flag=true;
        while (!q.isEmpty()) {
            List<Integer> arr = new ArrayList<>();
            int n=q.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                arr.add(node.val);
                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }
            if(flag)brr.add(arr);
            if(!flag){
                Collections.reverse(arr);
                brr.add(arr);
            }
            flag=!flag;
        }
        return brr;
    }
}