package BinaryTree;

import java.util.*;

public class Tree {
    int data;
    Tree left;
    Tree right;

    public Tree(int d) {
        this.data = d;
        this.left = null;
        this.right = null;
    }

    static class BinaryTree {
        static int idx = -1;

        public static Tree buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Tree newTree = new Tree(nodes[idx]);
            newTree.left = buildTree(nodes);
            newTree.right = buildTree(nodes);

            return newTree;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, -1, -1, 3, -1, -1};

        Tree node = BinaryTree.buildTree(nodes);
        //traversal preorder
       // preorder(node);/* root => left =>right */
      //  inorder(node); /*left => root => right */
     // postOrder(node);/*left =>right=>root */
     //levelOrder(node);
   int x = height(node);
   //sumOfBT(node); 
  // countNodes(node);
   System.out.println(x);
    
    }


      private static int height(Tree node) {
     if(node == null){
      return 0;
     }
     int leftSubTree = height(node.left);
     int rightSubTree = height(node.right);
     int myHeight = Math.max(leftSubTree,rightSubTree) + 1;
     return myHeight;
    }

   private static int sumOfBT(Tree node) {
     if(node == null){
      return 0;
     }
     int leftSubTree = sumOfBT(node.left);
     int rightSubTree = sumOfBT(node.right);

     return leftSubTree+rightSubTree+node.data;
    }

  private static int countNodes(Tree node) {
    if(node == null){
      return 0;
    }
    int leftSubTree = countNodes(node.left);
    int rightSubTree = countNodes(node.right);
    return leftSubTree+rightSubTree+1;
     
    }

  private static void levelOrder(Tree node) {
    Queue<Tree>q = new LinkedList<>();
    q.add(node);
    q.add(null);
    while(!q.isEmpty()){
      Tree currNode = q.poll();
      if(currNode == null){
        System.out.println();
        if(q.isEmpty()){
         break;
        }
        else{
           q.add(null);
        }
      }
      else{
        System.out.print(currNode.data+" ");
        if(currNode.left != null){
          q.add(currNode.left);
        }
        if(currNode.right != null){
          q.add(currNode.right);
        }
      }
    }

    }

  private static void postOrder(Tree node) {
     if(node == null){
        return;
      }
      postOrder(node.left);
      postOrder(node.right);
      System.out.println(node.data);
    }

 private static void inorder(Tree node) {
       if(node == null){
        return;
      }
      inorder(node.left);
      System.out.println(node.data);
      inorder(node.right);
    }

    private static void preorder(Tree node) {
      if(node == null){
        return;
      }
      System.out.println(node.data);
      preorder(node.left);
      preorder(node.right);
    }
}
