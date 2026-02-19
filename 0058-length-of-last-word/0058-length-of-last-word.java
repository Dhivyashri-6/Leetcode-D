class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length()-1;
        int res=0;
        while(n>=0){
            if(s.charAt(n)!=' '){
                res++;
            }
            else{
                if(res>0) return res;
            }
n--;
        }
        return res;
    }
}