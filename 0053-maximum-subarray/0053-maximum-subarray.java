class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            ans=Math.max(ans,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<0){
                sum=0;
            }
            else
            {
                sum+=nums[i];
                ans=Math.max(sum,ans);
            }
        }
        return ans;
    }
}