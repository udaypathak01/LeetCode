class Solution {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1, count = 0;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return check(s, i + 1, j) || check(s, i, j - 1);
            }
        }
        return count <= 1;
    }

    public boolean check(String s, int i,int j){
        while(i<j){
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}