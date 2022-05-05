import java.util.*;
class InsertionSort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int temp;
System.out.println("Enter the size");
int size=sc.nextInt();
int array[]=new int[size];

System.out.println("Enter the elements");
for(int i=0;i<size;i++)
{
	array[i]=sc.nextInt();
	
}
System.out.println("the elements are");
for(int i=0;i<size;i++)
{
	System.out.println(array[i]);
}
int j=0;
for(int i=0;i<=size-1;i++)
{
	temp=array[i];
	
		while(temp<array[j]&&j>=0)
		{
			array[j+1]=array[j];
			j=j-1;
		}
		array[j+1]=temp;
}
	for(int k=0;k<=size-1;k++)
	{
		System.out.println();
		System.out.print(array[k]+" ");
	}
	
}

}
