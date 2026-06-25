class Solution {
    private int maxSum = Integer.MIN_VALUE;

    private int solve(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, solve(root.left));
        int right = Math.max(0, solve(root.right));

        maxSum = Math.max(maxSum, left + right + root.val);

        return root.val + Math.max(left, right);
    }

    public int maxPathSum(TreeNode root) {
        solve(root);
        return maxSum;
    }
}
