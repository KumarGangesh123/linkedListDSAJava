/* 
  this is the "Node.java" file in which all the operations like:
    LinkedListCreation
    LinkedListInsertion
    LinkedListInsertion
    LinkedListDeletion
    LinkedListSorting
    LinkedListReversing
    LinkedListMerging
  like methods are written
*/

/*
  you just have to compile the file by javac -d . Node.java
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

    public int lengthOfList(node head){       // this method will return the length of the linked list 
        int x=0;
        while(head != null){
            head=head.next;
            x++;
        }
        return x;
    }

    public node insertAtPos(node head,int pos,int data){      // this method will return the node , in this the new data will be inserted on the specified position
        node n1=head;
        node n2=head;
        int x=1;
        while(x != pos-1){
            n2=n2.next;
            x++;
        }
        node newNode = createNode(data);
        newNode.next=n2.next;
        n2.next=newNode;
        return n1;
    }

    public node insertAtLast(node head,int data){       // this method will return the node , in which the new data will be added at the last of the list
        node n1=head;
        node n2=head;
        node newNode = createNode(data);
        while(n2.next != null){
            n2=n2.next;
        }
        n2.next=newNode;
        return n1;
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

    public node listReverseing(node head){        // this method is use to reverse the linked list
        node nd=head;
        node n1=null;
        node n2=null;
        while(nd != null){
            n2=nd.next;
            nd.next=n1;
            n1=nd;
            nd=n2;
        }
        head = n1;
        return head;
    }

    public void listSorting(node head){       // this method is use to sort the linked list
        node head2=head;
        node n1=head;
        node n2=null;
        int x;
        while(n1 != null){
            n2=n1.next;
            while(n2 != null){
                if(n1.data > n2.data){
                    x=n1.data;
                    n1.data=n2.data;
                    n2.data=x;
                }
                n2=n2.next;
            }
            n1=n1.next;
        }
        
    }

    public node mergeLists(node first,node second){       // this method id use to merge the two linked lists
        node mergedNode=null;
        node first1=first;
        node second1=second;
        mergedNode=createNode(first1.data);
        node first11=first.next;
        while(first11 != null){
            mergedNode = insertAtLast(mergedNode, first11.data);
            first11=first11.next;
        }
        while(second1 != null){
            mergedNode = insertAtLast(mergedNode,second1.data);
            second1=second1.next;
        }
        return mergedNode;
    }

    public void displayList(node head){      // this method is use to display the linked list , this method uses the iterative approach
        int x=0;
        System.out.print("\n\nData in the linked list is :\n\n");
        while(head != null){
            System.out.print("\nData in the "+(x+1)+" node is :\t"+head.data);
            head=head.next;
            x++;
        }
    }
  
  public void showListByRecursion(Node head){   //  this method is use to display the linked list , this method uses the recursive approach
    if(head == null){
      return ;
    }
    System.out.print(head.data+" ");
    showListByRecursion(head.next);
  }
  
}

