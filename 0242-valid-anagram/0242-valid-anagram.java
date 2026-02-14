class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        int[] count=new int[26];
       for(char c:a){
        count[c-'a']++;
       }
           for(char c:b){
        count[c-'a']--;
       }
       for(int val:count){
        if(val!=0)return false;
       }
       return true;
    }
}