class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);

        int ans = arr[0] + arr[1] + arr[2];

        for (int k = 0; k < arr.length; k++) {
            int i = k + 1, j = arr.length - 1;

            while (i < j) {
                int sum = arr[i] + arr[k] + arr[j];

              if(Math.abs(target-sum)<Math.abs(target-ans)){
                ans=sum;
              }
                if (sum == target) {
                   return target;
                } else if (sum < target) {
                    i++;
                } else {
                    j--;
                }
            }
           
        }
        return ans;
    }
}