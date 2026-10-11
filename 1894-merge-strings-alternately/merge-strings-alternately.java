class Solution {
    public String mergeAlternately(String s, String t) {
        int i=0,j=0;
        StringBuilder sb=new StringBuilder();
        while(i<s.length()&&j<t.length()){
            sb.append(s.charAt(i++));
            sb.append(t.charAt(j++));
        }
        while(i<s.length()){
            sb.append(s.charAt(i++));
        }
        while(j<t.length()){
            sb.append(t.charAt(j++));
        }
        return sb.toString();
    }
}