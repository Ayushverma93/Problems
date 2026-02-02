class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = -1, missing = -1;

        for(int i = 1; i <= nums.length; i++){
            int count = 0;
            for (int j = 0; j < nums.length; j++){
                if (nums[j] == i){
                    count++;
                }
            }