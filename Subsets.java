class Solution {

    void solve(int idx,List<List<Integer>>ans,List<Integer> res,int[] nums,int n){
        if(idx >= n){
            ans.add(new ArrayList<>(res));
            return;
        }