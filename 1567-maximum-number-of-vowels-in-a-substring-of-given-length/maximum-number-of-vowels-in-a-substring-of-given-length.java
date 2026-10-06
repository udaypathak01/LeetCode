class Solution {
    public int maxVowels(String s, int k) {
        if(s.length()==0)return 0;
        int i = 0, j = 0;
        char[] arr = s.toCharArray();
        int count = 0;
        int best = 0;
        while (j < arr.length) {
            if (arr[j] == 'a' || arr[j] == 'i' || arr[j] == 'e' || arr[j] == 'o' || arr[j] == 'u')
                count++;
            if (j - i + 1 == k) {
                best = Math.max(count, best);
                if (arr[i] == 'a' || arr[i] == 'i' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'u'){
                count--;}
                i++;
            }
            j++;
        }
        return best;
    }
}