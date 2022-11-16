/* this code is use to merge two linked lists */

/*
  in it a package named "dsa" included 
  first of all you have to keep the files "Node.java" and "linkedListMerge.java" together in a folder then :
  for complie this file write on terminal -> javac -d . linkedListMerge.java
  then run the file by -> java dsa.linkedListMerge
*/


package dsa;
import java.util.Scanner;
public class linkedListMerge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range for the first list :\t");
        int range1=sc.nextInt();
        Node nd=new Node();
        Node.node head1=nd.connectNodes(range1);
        nd.displayNodes(head1);

        System.out.print("\n\nEnter the range for the second list :\t");
        int range2=sc.nextInt();
        Node.node head2=nd.connectNodes(range2);
        nd.displayNodes(head2);
        Node.node mergedNode=nd.mergeLists(head1, head2);
        nd.displayNodes(mergedNode);
    }
}
