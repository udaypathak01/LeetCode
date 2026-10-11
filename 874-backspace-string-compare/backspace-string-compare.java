class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st=new Stack<>();
        Stack<Character>pt=new Stack<>();
        for(char a:s.toCharArray()){
            if(a=='#'){
                if(st.isEmpty()){
                    continue;
                }
                st.pop();
            }else{
                st.push(a);
            }
        }
        for(char a:t.toCharArray()){
            if(a=='#'){
                if(pt.isEmpty()){
                    continue;
                }
                pt.pop();
            }else{
                pt.push(a);
            }
        }
return st.equals(pt);
    }
}