package javaRevison.LinkedList;
import java.util.Arrays;
import java.util.LinkedList;
public class Easy {
   
    public static void main(String[] args) {
        Node list = new Node(2);
       Node list1 = new Node(4);
       Node list2 = new Node(2);
       Node list3 = new Node(1);

       list.next = list1;
       list1.next = list2;
       list2.next = list3;

       Node newNode = removeDuplicates(list);
       while(newNode != null){
        System.out.println(newNode.data);
        newNode = newNode.next;
       }

    }



    public static Node removeDuplicates(Node head) 
    {
         // Your code here
        Node newHead  = new Node(head.data) ;
       
        newHead.next = null;
         Node temp = head.next;
        
        Node tail = newHead;
       
        while(temp != null){
            if(!check(temp,temp.data)){
                tail.next = temp;
                tail = tail.next;
               
            }
            temp = temp.next;
        }
        tail.next = null;
        return newHead;
             
         }
        public static boolean check(Node head,int data){
            Node temp = head;
            while(temp != null){
                System.out.println('t'+" "+temp.data+" d"+data);
                if(temp.data != data){
                    return false;
                }
                temp = temp.next;
            }
            return true;
        }
    

    
}
