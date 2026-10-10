class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>>list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int left = j + 1, right = arr.length - 1;

                while (left < right) {
                    long sum = (long)arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == target) {
                        set.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                    left++;
                    right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
list.addAll(set);
return list;
    }
}