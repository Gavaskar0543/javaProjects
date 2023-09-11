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
     levelOrder(node);
    
    }

   private static void levelOrder(Tree node) {
    Queue<Integer>queue = new LinkedList<>();
    
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
