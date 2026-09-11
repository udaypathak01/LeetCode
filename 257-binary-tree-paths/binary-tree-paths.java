
class Solution {
    public static void helper(TreeNode root,List<String>list,String s){
        if(root==null)return;
        if(root.left==null&&root.right==null){
            s+=root.val;
            list.add(s);
            return;
        }
        helper(root.left,list,s+root.val+"->");
        helper(root.right,list,s+root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>list=new ArrayList<>();
        helper(root,list,"");
        return list;
    }
}