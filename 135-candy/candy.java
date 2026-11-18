class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] arr = new int[n];
        
        //with give 1 candy to each
        for (int i = 0; i < n; i++) {
            arr[i] = 1;
        }
        //compare from left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                arr[i] = arr[i - 1] + 1;
            }
        }
        //compare from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                arr[i] = Math.max(arr[i], arr[i + 1] + 1);
            }
        }
        //calculate sum of all candies
        int res = 0;
        for (int x : arr) {
            res += x;
        }
        return res;
    }
}