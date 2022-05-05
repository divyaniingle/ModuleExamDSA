import java.util.*;
class linkedList
{
	Node head=null;
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
			//this.prev=null;
		}
	}
	void creation()
	{
		int n=0;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("enter the elemnt");
		int new_data=sc.nextInt();
		Node new_node=new Node(new_data);
		if(head==null)
		{
			head=new_node;
			new_node=null;
		}
		else
		{
			new_node.next=head;
			head=new_node;
		}
		System.out.println("press 1 to emter more element");
		n=sc.nextInt();
		
		}while(n==1);
		
	}
	void display()
	{
		Node n=head;
		while(n.next!=head)
		{
			System.out.println(n.data);
			n=n.next;
		}
		
	}
public static void main(String args[])
{
linkedList l=new linkedList();
l.creation();
l.display();
}
}