class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> list = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for (int k = 0; k < arr.length; k++) {
            int i = k + 1, j = arr.length - 1;
            while (i < j) {
                int sum = arr[k] + arr[i] + arr[j];
                if (sum == 0) {
                    set.add(Arrays.asList(arr[k], arr[i], arr[j]));
                    i++;
                    j--;
                } else if (sum > 0) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        list.addAll(set);
        return list;
    }
}