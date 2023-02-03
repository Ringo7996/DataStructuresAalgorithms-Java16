class BinarySearchTreeLinkedList {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if (root == null) {
            root = node;
        } else {
            TreeNode temp = root;
            while (temp != null) {
                if (node.val > temp.val) {
                    if (temp.right == null){
                        temp.right = node;
                        break;
                    }
                    temp = temp.right;
                } else {
                    if (temp.left == null){
                        temp.left = node;
                        break;
                    }
                    temp = temp.left;
                }
            }
        }
        return root;
    }
}




