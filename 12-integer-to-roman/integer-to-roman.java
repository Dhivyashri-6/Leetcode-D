class Solution {
    public String intToRoman(int num) {
          String [] a={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int arr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String res="";
        for(int i=0;i<arr.length;i++){
            while(num>=arr[i])
            {
                num-=arr[i];
                res+=a[i];
            }
        }
        return res;
    }
}