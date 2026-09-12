class Solution { 
    public boolean rotateString(String s, String goal) {
        StringBuilder sb=new StringBuilder(s);
        StringBuilder sg=new StringBuilder(goal);
       for(int i=0;i<s.length();i++){
        char ch=sb.charAt(0);
        sb.deleteCharAt(0);
        sb.append(ch);
        if(sb.toString().equals(sg.toString()))return true;
       } 
       return false;
    }
}