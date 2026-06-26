class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        fun(candidates, 0, target, new ArrayList<>());
        return ans;
    }

    void fun(int[] arr, int idx, int target, List<Integer> list) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (target < 0 || idx >= arr.length) {
            return;
        }

        // Include
        list.add(arr[idx]);
        fun(arr, idx, target - arr[idx], list);
        list.remove(list.size() - 1);

        // Exclude
        fun(arr, idx + 1, target, list);
    }
}