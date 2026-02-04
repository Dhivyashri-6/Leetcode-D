class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        for(String s:strs)
{
    if(isOneAlphabet(s)){
max=Math.max(max,s.length());
    }
    else
    {
        int ans=Integer.parseInt(s);
        max=Math.max(max,ans);
    }

}
return max;
}  
public boolean isOneAlphabet(String s){
if(s.length()==0)return false;
for(char c:s.toCharArray()){
    if(Character.isLetter(c))return true;
    
}
return false;
}
  
}