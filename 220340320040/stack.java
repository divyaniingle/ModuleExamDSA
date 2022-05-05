import java.util.*;
import java.lang.*;
class stack
{
	final int max=15;
int s[]=new int[max];
int top1;
int top2;
stack()
{
	this.top1=max/2+1;
	this.top2=max/2;
}
void push1()
{
	int n=0;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter data");
	int data=sc.nextInt();
	if(top1>0)
	{
		top1--;
		s[top1]=data;
	}
	else 
	{
		System.out.println("statck is overflow");
	}

}
void push2()
{
	
	int n=0;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter data");
	int data=sc.nextInt();
	if(top2<max-1)
	{
		top2++;
		s[top2]=data;
	}
	else 
	{
		System.out.println("statck is overflow");
		
	}
	//System.out.println("press 1 to enter ,more data");
	
}
int pop1()
{
	if(top1<=max/2)
	{
		int x=s[top1];
		top1++;
		return x;
	}
	else
		System.out.println("underflow");
	return -1;
}
int pop2()
{
	if(top2>=max/2+1)
	{
		int x=s[top2];
		top2--;
		return x;
	}
	else
		System.out.println("underflow");
	return -1;
}
// void display()
// {
// for(int i=0;i<max;i++)
// {
	// System.out.println(s[i]);
// }
// }
public static void main(String args[])
{
	stack o=new stack();
	o.push1();
	o.push2();
	o.push2();
	o.push1();
	o.push2();
	o.push2();
	
	System.out.println("Popped element from stack1 is"+o.pop1());
	System.out.println("Popped element from stack1 is"+o.pop2());
	
	
	

}
}