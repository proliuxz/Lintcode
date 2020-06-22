package S801TO1000;

import Util.TreeNode;

public class S902 {
    public int kthSmallest(TreeNode root, int k) {
        int num = count(root.left);
        if(num == k-1)
            return root.val;
        if(num > k-1)
            return kthSmallest(root.left,k);
        return kthSmallest(root.right,k - num-1);
    }

    public int count(TreeNode root){
        if(root == null)
            return 0;
        return 1 + count(root.left) + count(root.right);
    }
}
