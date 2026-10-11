class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int x : nums1) {
            for (int y : nums2) {
                map.put((x+y), map.getOrDefault(x+y,0) + 1);
            }
        }

        for (int a : nums3) {
            for (int b : nums4) {
                int sum=-1*(a+b);
                if(map.containsKey(sum)){
                    count+=map.get(sum);
                }
            }
        }
        return count;
    }
}