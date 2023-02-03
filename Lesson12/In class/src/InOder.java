import java.util.ArrayList;
import java.util.List;

public class InOder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        return postOder(ans, root);

    }

    public List<Integer> postOder(List<Integer> ans, TreeNode root) {
        if (root == null) {
            return ans;
        }

        TreeNode temp = root;
        ans.add(temp.val);
        if (temp.right != null) {
            postOder(ans, temp.right);
        }
        if (temp.left != null) {
            postOder(ans, temp.left);
        }
        return ans;
    }
}
