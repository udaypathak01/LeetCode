class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i = 0, j = 0;
        long max = 0;
        long temp = 0;

        HashSet<Integer> set = new HashSet<>();

        while (j < nums.length) {

            // Remove duplicates
            while (set.contains(nums[j])) {
                temp -= nums[i];
                set.remove(nums[i]);
                i++;
            }

            // Add current element
            set.add(nums[j]);
            temp += nums[j];

            // Check window size
            if (j - i + 1 == k) {
                max = Math.max(max, temp);

                // Slide window
                temp -= nums[i];
                set.remove(nums[i]);
                i++;
            }

            j++;
        }

        return max;
    }
}