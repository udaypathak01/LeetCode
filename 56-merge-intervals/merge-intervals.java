class Solution {
    public int[][] merge(int[][] arr) {
        if(arr.length==0)return new int[0][];
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>ans=new ArrayList<>();
        int[]curr=arr[0];
        for(int i=1;i<arr.length;i++){
            if(curr[1]>=arr[i][0]){
                curr[1]=Math.max(curr[1],arr[i][1]);
            }else{
                ans.add(curr);
                curr=arr[i];
            }
        }
        ans.add(curr);
        return ans.toArray(new int[0][]);
    }
}