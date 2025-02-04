import java.util.ArrayList;
import java.util.List;



public class leetcode_94 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public static void main(String[] args) {

    }
    public static List<Integer> inOrder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        helper(res, root);
        return res;
    }
    public static void helper(List<Integer> res ,TreeNode root){
        if (root==null){
            return;
        }
        helper(res,root.left);
        res.add(root.val );
        helper(res,root.right);
    }

}
