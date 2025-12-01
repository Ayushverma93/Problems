// ----------------------------Search In Rotated Sorted Array----------------------//

class Solution {
    public int search(int[] nums, int target) {
        int left, right, mid;
        int n = nums.length;

        left = 0;
        right = n-1;

        while (left <= right){ 
            mid = left +(right - left) /2;