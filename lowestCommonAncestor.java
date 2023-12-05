// Medium 1 
// Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
// Explanation:
// In this program
//       The algorithm or approach used in this code is a recursive approach
//       1)A binary Search tree is made of root node ,left child and right child.Since it is binary search tree i have kept in mind 
 //        the conditions required to meet it they are like
//             a)leftsubtree<root node
//              b)rightsubtree>rootnode
 //             c)right and left subtrees are also bst with no duplicates 
 //           The ancestors are the nodes which exists in a path to reach certain node.hence,
//            lowestcommon ancestor is bascically the first ancestor which is common to both the given nodes.
//          So i understood i need to find lowest means the first ancestor common to both nodes.
//       2)firsti have created a static class TreeNde which declares variables for root node, left child and right child.
//       3)Then i have created a constructor to initalizes the node with a given value and setting both left and right child references to null.
//       4) here i have created a function lowestCommonAncestor which takes root node and 2 nodes as parameters to check LCA of given 2 nodes.
//       5)In function: i have declared a base class as if root is null i will return null .
//       6) i have used 2 if statements;
//           If both nodes  are smaller than the current root value, it means the LCA must be in the left subtree.
//            Recursively calls lowestCommonAncestor on the left subtree.
//           If both nodes are greater than the current root value, it means the LCA must be in the right subtree. 
//                 Recursively calls lowestCommonAncestor on the right subtree.
//       7) If one node is on the left and the other is on the right, or one of the nodes matches the current root, 
//                 then the current root is the LCA. Returns the current root.
//       8)Then i have constructed binarysearchtree in main method and called the lca function.
          
      
      
      
      
      
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

    

