class Solution {
    public void merge(int[] arr, int m, int[] brr, int n) {
        int i = 0, j = 0,s=0;
        int[] temp;
        if (arr.length >= brr.length) {
            temp = new int[arr.length];
        } else {
            temp = new int[brr.length];
        }
        while (i < m && j < n) {
            if (arr[i] <= brr[j]) {
                temp[s++] = arr[i++];
            } else {
                temp[s++] = brr[j++];
            }
        }
        while (i < m) {
            temp[s++] = arr[i++];
        }
        while (j < n) {
            temp[s++] = brr[j++];
        }
       for(int k=0;k<m+n;k++){
        arr[k]=temp[k];
       }
    }
}