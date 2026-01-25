//----------min diff between highest and lowest k Scores-------------
class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;

        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;