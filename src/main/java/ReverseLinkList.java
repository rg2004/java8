class Node{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
	}
	
}
public class ReverseLinkList {

	Node start;
	Node temp;
	
	public void add(Node node)
	{
		if(start==null)
		{
			start=node;
			start.next=null;
			temp=start;
			temp.next=null;
		}
		else
		{
			temp.next=node;
			temp=node;
			temp.next=null;
		}
	}
	
	public void display()
	{
		temp=start;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		ReverseLinkList list = new ReverseLinkList();
		Node node1 = new Node(12);
		list.add(node1);
		Node node2 = new Node(23);
		list.add(node2);
		Node node3 = new Node(7);
		list.add(node3);
		Node node4 = new Node(60);
		list.add(node4);
		Node node5 = new Node(11);
		list.add(node5);
		
		list.display();
		
	}
	
	
}
