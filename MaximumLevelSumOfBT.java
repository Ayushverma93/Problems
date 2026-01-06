class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int maxsum = Integer.MIN_VALUE;
        int maxlevel = -1,level = 1;

        while(!q.isEmpty()) {

            int levelsize = q.size();
            int sum = 0;
            for(int i = 0; i<levelsize; i++){
                TreeNode curr = q.remove();
                sum += curr.val;        