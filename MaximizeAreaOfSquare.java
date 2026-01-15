//-------------------Maximize Area of Square----------------------
class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {

        int maxHeight = getMaxGap(hBars);
        int maxWidth = getMaxGap(vBars);

        int side = Math.min(maxHeight, maxWidth);
        return side * side;
    }