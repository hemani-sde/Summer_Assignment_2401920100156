class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans1 = 0, ans2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    ans1 = i;
                    ans2 = j;
                }
            }
        }

        return new int[]{ans1, ans2};
    }
}
