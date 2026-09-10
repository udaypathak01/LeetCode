class Solution {
    public static int Height(TreeNode root) {
        if (root == null || root.left == null && root.right == null)
            return 0;
        return 1 + Math.max(Height(root.left), Height(root.right));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null || root.left == null && root.right == null)
            return 0;
        int midAns = Height(root.left) + Height(root.right);
        if (root.left != null)
            midAns++;
        if (root.right != null)
            midAns++;
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        return Math.max(midAns, Math.max(left, right));
    }
}