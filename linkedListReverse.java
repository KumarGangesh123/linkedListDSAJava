/* this code is use to reverse the linked list */



package dsa;
import java.util.Scanner;
public class  linkedListReverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range :\t");
        int range=sc.nextInt();
        Node nd=new Node();
        Node.node head=nd.connectNodes(range);
        nd.displayNodes(head);
        Node.node reverseNode = nd.listReverseing(head);
        nd.displayNodes(reverseNode);
    }
}
