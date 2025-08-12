class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0; // pointer for the position of the next non-zero

         for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                // Swap nums[left] and nums[right]
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
            }
        }
    }
}