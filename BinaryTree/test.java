package BinaryTree;

import java.util.Scanner;

public class test {
public static void main(String[] args) {
    Tree<Integer>node = takeInptu(true,0,true);
   // printTree(node);
  int x = findmax(node);
  System.out.println(x);

}

public static int findmin(Tree<Integer>root){
    if(root == null){
        return Integer.MAX_VALUE;
    }
   int left =  findmin(root.left );
  int right =   findmin(root.right);
  int overallMin = Math.min(root.data, Math.min(left, right)); // Compare with the current node
  return overallMin;
}
public static int findmax(Tree<Integer>root){
    if(root == null){
        return Integer.MIN_VALUE;
    }
    int left = findmax(root.left);
    int right = findmax(root.right);
    int overallMax = Math.max(root.data,Math.max(left, right));
    return overallMax;
}
private static void printTree(Tree<Integer> root) {
    if(root == null){
        return;
    }
    System.out.println(root.data);
    printTree(root.left);
    printTree(root.right);
}

private static Tree<Integer> takeInptu(boolean isRoot, int parentData, boolean isleftChild) {
    if(isRoot){
        System.out.println("Enter root data:");
    }
    else{
        if(isleftChild){
            System.out.println("enter leftchild of parent:"+" "+ parentData);
        }
        else{
            System.out.println("enter right of parent:"+" "+parentData);
        }
    }
    Scanner s  = new Scanner(System.in);
        int rootData = s.nextInt();
    Tree<Integer>root = new Tree<Integer>(rootData);
        if(rootData == -1){
             return null;
        }
       Tree<Integer>leftChild = takeInptu(false, rootData, true);
       Tree<Integer>rightChild = takeInptu(false, rootData, false);
       root.left = leftChild;
       root.right = rightChild;
        
    return root;
}


    
}