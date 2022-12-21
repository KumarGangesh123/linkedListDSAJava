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
class Node {
    class node{     // this is the node class to create the node of a linked list
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public node createNode(int data){     // for creating a new node of the linked list
        return new node(data);
    }

    public node connectNodes(int range){      // this method for connecting the nodes and return the head pointer of the list
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the data for the 1 node :\t");
        int data1=sc.nextInt();
        node newNode = createNode(data1);
        node n1=newNode;
        node n2=null;
        node head=n1;
        for(int x=2;x<=range;x++){
            System.out.print("\nEnter the data for the "+x+" node :\t");
            int data2=sc.nextInt();
            n2=createNode(data2);
            n1.next=n2;
            n1=n1.next;
        }
        return head;
    }
  
  public void displayNodes(node head){
    int index=0;
    while(head != null){
      System.out.print("\nData in the "+index+" is :\t"+head.data);
      index++;
      head=head.next;
    }
  }
}

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
