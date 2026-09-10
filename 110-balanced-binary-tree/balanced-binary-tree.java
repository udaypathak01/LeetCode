
class Solution {
    public static int Height(TreeNode root) {
        if (root == null || root.left == null && root.right == null)
            return 0;

        return 1 + Math.max(Height(root.left), Height(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        int l = Height(root.left);
        if (root.left != null)l++;
        int r = Height(root.right);
        if (root.right != null)r++;

         int bf = l - r;
        if (bf>1||bf<-1)
            return false;
        
       
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
