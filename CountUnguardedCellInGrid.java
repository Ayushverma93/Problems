//------------count unguarded cell in grid----------------
class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
         // 0 = empty, 1 = guard, 2 = wall, 3 = guarded
        int[][] grid = new int[m][n];
