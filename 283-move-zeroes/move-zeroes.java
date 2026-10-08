class Solution {
    public void moveZeroes(int[] nums) {
       ArrayList<Integer>list=new ArrayList<>();
       for(int x:nums){
        if(x!=0){
            list.add(x);
        }
       }
       Arrays.fill(nums,0);
       for(int i=0;i<list.size();i++){
nums[i]=list.get(i);
       }
    }
}