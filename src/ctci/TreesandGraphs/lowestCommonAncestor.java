package ctci.TreesandGraphs;

public class lowestCommonAncestor {

    private TreeNode lowestAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null){
            return null;
        }

        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        if(root.val < p.val && root.val < q.val){
            return lowestAncestor(root.right,p,q);
        }
        else
        if(root.val > p.val && root.val > q.val){
            return lowestAncestor(root.left,p,q);
        }
        else
            return root;
    }

    public static void main(String[] args){

     lowestCommonAncestor lca1 = new lowestCommonAncestor();
     /*
     TreeNode root = new TreeNode(6);
     root.left = new TreeNode(2);
     root.left.left = new TreeNode(0);
     root.left.right = new TreeNode(4);
     root.left.right.left = new TreeNode(3);
     root.left.right.right = new TreeNode(5);
     root.right = new TreeNode(8);
     root.right.left = new TreeNode(7);
     root.right.right= new TreeNode(9);

        Lowest Common Ancestor - 2
     */

     TreeNode root = new TreeNode(20);
     root.left = new TreeNode(10);
     root.left.left = new TreeNode(5);
     root.left.right = new TreeNode(15);
     root.left.right.right = new TreeNode(17);
     root.left.left.left = new TreeNode(3);
     root.left.left.right = new TreeNode(7);
     root.right = new TreeNode(30);

     TreeNode p = root.left.left.right;
     TreeNode q = root.left.right.right;

     int ancestor = lca1.lowestAncestor(root, p,q).val;
     System.out.println("Lowest Common Ancestor: ");
     System.out.println(ancestor);

    }
}

/*
 * Definition for a binary tree node.
 */
  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;

     TreeNode(int x) {
         val = x;
     }
}
