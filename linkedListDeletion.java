/* this code is use to delete the node of a linked list   */

/*
  in it a package named "dsa" included 
  first of all you have to keep the files "Node.java" and "linkedListDeletion.java" together in a folder then :
  for complie this file write on terminal -> javac -d . linkedListDeletion.java
  then run the file by -> java dsa.linkedListDeletion
*/

package dsa;
import java.util.Scanner;
public class Node {
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
  
  public node deleteAtPos(node head,int pos){       // this method will return the node , in which the data will be deleted at the specified position of the list
        node n1=head;
        node n2=head;
        int x=1;
        while(x != pos-1){
            n2=n2.next;
            x++;
        }
        node newNode=n2.next;
        n2.next=newNode.next;
        return n1;
    }

    public node deleteAtLast(node head){        // this method will return the node , in which the data will be deleted at the last of the list
        node n1=head;
        node n2=head;
        while(n2.next.next != null){
            n2=n2.next;
        }
        n2.next=null;
        return n1;
    }
  
  public void displayNodes(node head){      // this method is use to display the linked list
        int x=0;
        System.out.print("\n\nData in the linked list is :\n\n");
        while(head != null){
            System.out.print("\nData in the "+(x+1)+" node is :\t"+head.data);
            head=head.next;
            x++;
        }
    }
}


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
