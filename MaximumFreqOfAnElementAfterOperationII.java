//--maximum frequency of an element after operation II------------
class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        Map<Long, Integer> count = new HashMap<>();
        Map<Long, Integer> diff = new HashMap<>();