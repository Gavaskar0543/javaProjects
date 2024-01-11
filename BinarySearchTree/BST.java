package BinarySearchTree;
import java.util.*;
public class BST{
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
        public static boolean searchInBst(Node root,int val){
          if(root == null){
            return false;
          }
          //if value is less than root.data then go for left subTree
          if(root.data > val){
            return searchInBst(root.left, val);
          }
          //if found the match
        else if(root.data == val){
            return true;
          }

          else{
            return searchInBst(root.right, val);
          }
        }
        public static int minInBST(Node root) {
    return minHelper(root, Integer.MAX_VALUE);
}

public static int minHelper(Node root, int min) {
    if (root == null) {
        return min;
    }

    if (root.data < min) {
        min = root.data;
    }

    // Update min by comparing with the minimum value in the left subtree
    min = minHelper(root.left, min);

    // Update min by comparing with the minimum value in the right subtree
    min = minHelper(root.right, min);

    return min;
}

        
        public static Node inserNode(Node root,int val){
            if(root == null){
              //first node
              root = new Node(val);
              return root;
               
            }

            if(root.data > val){
             root.left =   inserNode(root.left, val);
            }
            else{
              root.right =  inserNode(root.right, val);
            }
            return root;
        }


   public static void inOrder(Node root){
    if(root == null){
        return;
    }
    inOrder(root.left);
    System.out.print(root.data+"-"+"");
    inOrder(root.right);
   }
    public static Node inOrderSuccessor(Node root){
      while(root.left != null){
        root = root.left;
      }
      return root;
    }

      public static Node delete(Node root, int val){
      if(root.data > val){
        root.left = delete(root.left,val);
      }
      else if(root.data < val){
        root.right = delete(root.right,val);
      }
      else{
        //root.data == val
        //case 1
        if(root.left == null && root.right == null){
          return null;
        }
        
        //case 2 
        if(root.left == null){
          return root.right;
        }
        else if(root.right == null){
          return root.left;
        }

        //find the left most node in the right subtree
        Node IS = inOrderSuccessor(root.right);
        root.data = IS.data;
        root.right = delete(root.right,IS.data);
      }
      return root;
    }
   

   public static void printInRange(Node root,int x , int y){
    if(root == null){
      return;
    }
    if(root.data >= x && root.data <= y){
      printInRange(root.left,x,y);
      System.out.println(root.data);
      printInRange(root.right,x,y);
    }
    else if(root.data >= y){
      printInRange(root.left,x,y);
    }
    else{
      printInRange(root.right,x,y);
    }
   }


    }
     public static void main(String args[]){
       int arr[] = {1,2,3,4,5,6,7,8,9,10};
  
       Node root = null;
       for(int i = 0;i<arr.length;i++){
        root = Node.inserNode(root,arr[i]);
       }
     // Node.inOrder(root);
   // System.out.println( Node.searchInBst(root, 1)); 
   //System.out.println(Node.minInBST(root));
   Node.inOrder(root);
  // System.out.println("After deleteing the node");
   //Node.delete(root,3);
   //Node.inOrder(root);
   Scanner s = new Scanner(System.in);
   System.out.println("Enter Starting Range:");
   int  x = s.nextInt();
   System.out.println("Enter End Range:");
   int y = s.nextInt();
   System.out.println("printing in Range between"+" "+x+" :"+y);
   Node.printInRange(root,x,y);
    }
}