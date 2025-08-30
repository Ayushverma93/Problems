class Solution {
    public int scoreOfString(String s) {
        char[] arr = s.toCharArray();

        int Score = 0;
        for(int i=1; i< arr.length; i++){
            Score += Math.abs(arr[i]-arr[i-1]);  // Math.abs is use to give the postive value of this.
        }
        return Score;
    }
}