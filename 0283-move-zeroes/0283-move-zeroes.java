class Solution {
    public void moveZeroes(int[] nums) {
        int m=nums.length;
        List<Integer> arr=new ArrayList<>();
        for(int n:nums){
            if(n!=0)
            arr.add(n);
        }
        for(int n:nums){
            if(n==0)arr.add(n);
        }
        for(int i=0;i<m;i++){
            nums[i]=arr.get(i);
        }
    }
}