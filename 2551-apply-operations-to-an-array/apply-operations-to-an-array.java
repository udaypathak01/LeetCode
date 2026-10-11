class Solution {
    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int a:nums){
            if(a!=0){
                list.add(a);
            }
        }
        for(int a:nums){
            if(a==0){
                list.add(0);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}