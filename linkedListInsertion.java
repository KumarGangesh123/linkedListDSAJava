/* this code is use to insert the node in the linked list */

/*
  in it a package named "dsa" included 
  first of all you have to keep the files "Node.java" and "linkedListInsertion.java" together in a folder then :
  for complie this file write on terminal -> javac -d . linkedListInsertion.java
  then run the file by -> java dsa.linkedListInsertion
*/


package dsa;
import java.util.Scanner;
public class linkedListInsertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range :\t");
        int range=sc.nextInt();
        Node nd=new Node();
        Node.node head=nd.connectNodes(range);
        nd.displayNodes(head);
        System.out.print("\n\nEnter the position to insert the node :\t");
        int pos=sc.nextInt();
        System.out.print("\n\nEnter the data to insert the node :\t");
        int data=sc.nextInt();
        if(pos == 1){
            Node.node newNode=nd.createNode(data);
            newNode.next=head;
            head=newNode;

        }else if(pos>1  && pos<nd.lengthOfList(head)){
            head = nd.insertAtPos(head, pos, data);
        }else{
            head = nd.insertAtLast(head, data);
        }
        nd.displayNodes(head);
    }
}
