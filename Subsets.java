class Solution {

    void solve(int idx,List<List<Integer>>ans,List<Integer> res,int[] nums,int n){
        if(idx >= n){
            ans.add(new ArrayList<>(res));
            return;
        }

        res.add(nums[idx]);
        solve(idx+1,ans,res,nums,n);
        res.remove(res.size()-1);
