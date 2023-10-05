// The code to check whether the trees are symmetric or not.

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.right);

    }
    private boolean helper(TreeNode l, TreeNode r){
        if(l==null && r==null) return true;
        if(l==null || r == null) return false;
        return ((l.val == r.val) && (helper(l.left, r.right) && helper(l.right, r.left)));
    }
}
