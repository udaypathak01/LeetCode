class Solution {
    public int[] twoSum(int[] arr, int k) {
        int i = 0, j = arr.length - 1;
        int[] brr = new int[2];

        while (i < j) {
            int temp = arr[i] + arr[j];
            if (temp == k) {
                brr[0] = i + 1;
                brr[1] = j + 1;
                return brr;
            } else if (temp > k) {
                j--;
            } else {
                i++;
            }
        }
        return brr;
    }
}