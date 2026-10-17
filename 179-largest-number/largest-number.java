class Solution {
    public String largestNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                String s = "" + nums[i] + nums[j];
                String t = "" + nums[j] + nums[i];

                if (s.compareTo(t)<0) {
                    int x = nums[i];
                    nums[i] = nums[j];
                    nums[j] = x;
                }
            }
        }
        if(nums[0]==0){
            return "0";
        }
       StringBuilder temp = new StringBuilder();
        for (int x : nums) {
            temp.append(x);
        }
        return temp.toString();
    }
}