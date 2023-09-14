package BinarySearchTree;

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
    System.out.println(root.data);
    inOrder(root.right);
   }
    }
     public static void main(String args[]){
       int arr[] = {1,2,5,3,4};
  
       Node root = null;
       for(int i = 0;i<arr.length;i++){
        root = Node.inserNode(root,arr[i]);
       }
      Node.inOrder(root);
    System.out.println( Node.searchInBst(root, 7)); 
    }
    
}
