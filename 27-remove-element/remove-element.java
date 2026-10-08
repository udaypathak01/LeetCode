class Solution {
    public int removeElement(int[] arr, int val) {
       ArrayList<Integer>list=new ArrayList<>();
       for(int i:arr){
       if(i!=val){
         list.add(i);
       }
       }
       Arrays.fill(arr,0);
       for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
       }
       return list.size();
    }
}