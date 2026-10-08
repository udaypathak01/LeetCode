class Solution {
    public boolean isPalindrome(String s) {
        String[]ch =s.split("[^a-zA-Z0-9]");
      StringBuilder sb=new StringBuilder(String.join("",ch).toLowerCase());
     int i=0,j=sb.length()-1;
while(i<j){
if(!(sb.charAt(i)==sb.charAt(j))){
return false;
}
i++;
j--;
}
      return true;
        
    }
}