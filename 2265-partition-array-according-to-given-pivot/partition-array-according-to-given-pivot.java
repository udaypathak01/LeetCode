class Solution {
    public int[] pivotArray(int[] nums, int p) {
      ArrayList<Integer>list=new ArrayList<>();
      for(int a:nums){
        if(a<p){
            list.add(a);
        }
      }
      for(int a:nums){
        if(a==p){
            list.add(a);
        }
      }
      for(int a:nums){
        if(a>p){
            list.add(a);
        }
      }
      return list.stream().mapToInt(Integer::intValue).toArray();
    }
}