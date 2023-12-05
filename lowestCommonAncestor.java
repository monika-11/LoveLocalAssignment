
import java.util.*;
public class lowestCommonAncestor{


      static class TreeNode {
             int val;
            TreeNode left;
             TreeNode right;

         public TreeNode(int val) {
                this.val = val;
                this.left = null;
                this.right = null;
    }
}



public static  TreeNode lowestCommonAncestor(TreeNode root,TreeNode p, TreeNode q)
{
      if (root == null) {
          return null; // Base case
         }

// If both nodes are smaller than the root
         if (p.val < root.val && q.val < root.val) {
                         return lowestCommonAncestor(root.left, p, q);
         }

// If both nodes are greater than the root
        if (p.val > root.val && q.val > root.val) {
               return lowestCommonAncestor(root.right, p, q);
           }

// If one node is on the left and the other is on the right, root is the LCA
        return root;


}

public static void main(String[] args) {
lowestCommonAncestor Findlca = new lowestCommonAncestor();

//  BST
TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.right = new TreeNode(8);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
// Nodes for which we want to find the LCA
         TreeNode p = root.left;//(2)
        TreeNode q = root.left.right; //(4)

// Find and print the LCA
       TreeNode lca = Findlca.lowestCommonAncestor(root, p, q);
       System.out.println("Lowest Common Ancestor: " + lca.val);
}
 

}

    

