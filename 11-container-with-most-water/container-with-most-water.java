class Solution {
    public int maxArea(int[] arr) {
        int i = 0, j = arr.length - 1, maxArea = 0;
        while (i <= j) {
            int area = Math.min(arr[i], arr[j]) * (j - i);
            maxArea=Math.max(area,maxArea);
            if(arr[i]<=arr[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}