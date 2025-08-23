class Solution {
    public int singleNonDuplicate(int[] nums) {
        int count = 0;
        for (int i=0 ;i< nums.length - 1; i+= 2){