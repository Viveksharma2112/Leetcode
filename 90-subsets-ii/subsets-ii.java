class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums); 

        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 0, nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result,
                           List<Integer> curr,
                           int start,
                           int[] nums) {

        result.add(new ArrayList<>(curr));

        for (int i = start; i < nums.length; i++) {

            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            curr.add(nums[i]);

            backtrack(result, curr, i + 1, nums);

            curr.remove(curr.size() - 1);
        }
    }
}
