class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int x:nums){
            if(x%2==0){
                list.add(x);
            }
        }
        for(int x:nums){
            if(x%2!=0){
                list.add(x);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}