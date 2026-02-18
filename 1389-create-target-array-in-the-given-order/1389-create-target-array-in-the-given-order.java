class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int m=index.length;
        List <Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(index[i],nums[i]);
        }
        int target[]=new int[n];
        for(int i=0;i<n;i++){
            target[i]=l.get(i);
        }
        return target;
    }
}