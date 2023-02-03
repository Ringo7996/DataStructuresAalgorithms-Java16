import java.util.ArrayList;

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        ArrayList<Integer> depth = new ArrayList<>();
        CountDepth(depth, 0, root);

        int maxDepth = 0;
        for (Integer i : depth) {
            maxDepth = Math.max(i, maxDepth);
        }

        return maxDepth;
    }

    public ArrayList<Integer> CountDepth(ArrayList<Integer> depth, int count, TreeNode root) {
        TreeNode temp = root;
        if (temp.right == null && temp.left == null) {
            depth.add(count);
            return depth;
        }

        if (temp.right == null) {
            return CountDepth(depth, count + 1, temp.left);
        }

        if (temp.left == null) {
            return CountDepth(depth, count + 1, temp.right);
        }

        CountDepth(depth, count + 1, temp.left);
        CountDepth(depth, count + 1, temp.right);

        return depth;
    }
}
