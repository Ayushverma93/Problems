//----------------minimum numbere of operation to make element one -----------------------
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        //count 1
        int count1 =0;
        for(int x : nums) if (x == 1) count1++;