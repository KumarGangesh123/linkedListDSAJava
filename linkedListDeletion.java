/* this code is use to delete the node of a linked list   */

/*
  in it a package named "dsa" included 
  first of all you have to keep the files "Node.java" and "linkedListDeletion.java" together in a folder then :
  for complie this file write on terminal -> javac -d . linkedListDeletion.java
  then run the file by -> java dsa.linkedListDeletion
*/

package dsa;
import java.util.Scanner;
public class linkedListDeletion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range :\t");
        int range=sc.nextInt();
        Node nd=new Node();
        Node.node head=nd.connectNodes(range);
        nd.displayNodes(head);
        System.out.print("\n\nEnter the position to delete the node :\t");
        int pos=sc.nextInt();
        if(pos == 1){
            head = head.next;
        }else if(pos>1 && pos<nd.lengthOfList(head)){
            head = nd.deleteAtPos(head, pos);
        }else{
            head = nd.deleteAtLast(head);
        }
        nd.displayNodes(head);
    }
}
