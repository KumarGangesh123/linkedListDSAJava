/*
  this is the method use to create the linked list 
*/

/*
  in it a package named "dsa" included 
  first of all you have to keep the files "Node.java" and "linkedListCreation.java" together in a folder then :
  for complie this file write on terminal -> javac -d . linkedListCreation.java
  then run the file by -> java dsa.linkedListCreation
*/

package dsa;
import java.util.Scanner;
public class linkedListCreation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range :\t");
        int range=sc.nextInt();
        Node nd=new Node();
        Node.node head=nd.connectNodes(range);
        nd.displayNodes(head);
    }
}
