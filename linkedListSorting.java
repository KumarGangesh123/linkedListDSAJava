/* this code is use to sort the linked list */

/*
  in it a package named "dsa" included 
  first of all you have to keep the files "Node.java" and "linkedListSorting.java" together in a folder then :
  for complie this file write on terminal -> javac -d . linkedListSorting.java
  then run the file by -> java dsa.linkedListSorting
*/


package dsa;
import java.util.Scanner;
public class linkedListSorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range :\t");
        int range=sc.nextInt();
        Node nd=new Node();
        Node.node head=nd.connectNodes(range);
        nd.displayNodes(head);
        nd.listSorting(head);
        nd.displayNodes(head);
    }
}
