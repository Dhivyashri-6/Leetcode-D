class Solution {
    public int findNumbers(int[] nums) {
        int m=0;
        for(int n:nums){
            int count=0;
            while(n>0){
                int rem=n%10;
                count++;
                n=n/10;
            }
            if(count%2==0)m++;
        }
        return m;
    }
}