class Solution {
    public void duplicateZeros(int[] arr) {
        int[] temp = new int[arr.length];
        int i = 0, j = 0;
        while (j < temp.length) {
            if(arr[i]==0&&j+1<temp.length){
                temp[j]=arr[i];
                temp[++j]=arr[i];
            }else{
                temp[j]=arr[i];
            }
            j++;
            i++;
        }
        for (int k = 0; k < arr.length; k++) {
            arr[k] = temp[k];
        }
    }
}