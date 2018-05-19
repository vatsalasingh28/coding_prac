
	import java.util.*;
	class insertion
	{
	 public static void main(String args[])
	 {
	 Scanner sc=new Scanner(System.in);
	 int size;
	 int i,j;
	 int[] arr;
	 System.out.println("enter the size of array");
	 size=sc.nextInt();
	 arr=new int[size];
	 System.out.println("enter the element to an array");
	 for(i=0;i<size;i++)
	  {
	   arr[i]=sc.nextInt();
	  }
	 for(i=1;i<size;i++)
	  {
	   int key=arr[i];
	   j=i-1;
	   while(j>=0 && arr[j]>key)
	    {
	       arr[j+1]=arr[j];
	       j=j-1;
	     }
	    arr[j+1]=key;
	  }
	  System.out.println("Sorted array");
	  for(i=0;i<size;i++)
	  {
	     System.out.println(arr[i]+" ");
	  }
	}
	}
