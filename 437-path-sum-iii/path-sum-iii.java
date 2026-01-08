class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        int countFromRoot = dfs(root, targetSum);

        int leftCount = pathSum(root.left, targetSum);

        int rightCount = pathSum(root.right, targetSum);

        return countFromRoot + leftCount + rightCount;
    }

    private int dfs(TreeNode node, long target) {
        if (node == null) return 0;

        int count = 0;
        if (node.val == target) {
            count = 1;
        }

        count += dfs(node.left, target - node.val);
        count += dfs(node.right, target - node.val);

        return count;
    }
}
