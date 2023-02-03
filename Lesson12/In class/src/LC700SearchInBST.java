public class LC700SearchInBST {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);

        TreeNode temp = root;
        while (temp.val != val && temp != null) {
            if (temp.val > val) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return temp;
    }
}
