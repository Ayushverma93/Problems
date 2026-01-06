class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int maxsum = Integer.MIN_VALUE;
        int maxlevel = -1,level = 1;