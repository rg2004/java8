import java.util.Scanner;

/**
 * Created by rohit on 9/16/2017.
 */
public class ReverseList {

    Node start;
    Node current;

     public static void main(String[] args) {

         int x = 5 ^ 5;
         System.out.println("x is "+x);
         ReverseList obj = new ReverseList();
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int num = scan.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter data for "+i+" Node->");
            int data = scan.nextInt();
            Node node = new Node(data);
            obj.addNode(node);
        }
         System.out.println("diplaying list");
         obj.display();
         System.out.println("reversing list now");
         obj.reverse();
         System.out.println("showing resersed list now");
         obj.display();
    }

    public void addNode(Node node)
    {
        if(start==null)
        {
            start=node;
            start.next=null;
            current=node;

        }
        else
        {
         current.next=node;
         current=node;
         current.next=null;
        }

    }
    public void display()
    {
        Node temp=start;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }


    public void reverse()
    {

        Node current = start;
        Node prev=null;
        Node next;

       while(current!=null)
       {
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
       }
        start=prev;

    }

}
