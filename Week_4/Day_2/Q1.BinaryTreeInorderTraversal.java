import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> ans = new ArrayList<>();

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return ans;
    }
}
