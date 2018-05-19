import java.util.*;
public class binary_search {

	public static void main(String[] args) {	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the element size");
		int size =sc.nextInt();
		int arr[]=new int [size];
        int element;
        
        for(int i=0;i<size;i++)
        {
        	System.out.println("enter the element to an array");
        	arr[i]=sc.nextInt();
        }
        System.out.println("enter the element you want to array");
        element = sc.nextInt();
        binary_search ob=new binary_search();
             ob.sorting(arr, size);
             ob.bin_search(arr,element,0,size);
	}
  public static  void sorting(int arr[],int size)
   {
   	for(int i=0;i<size-1;i++)
   	{
   		for(int j=0;j<size-i-1;j++)
   		{
   			if(arr[j]>arr[j+1])
   			{
   				int temp =arr[j];
   				arr[j]=arr[j+1];
   				arr[j+1]=temp;
   			}
   		}
   	}
   }
   public static void bin_search(int[] arr,int element,int first,int last)
      {
   	      int mid=(first+last)/2;
   	      if (arr[mid]==element)
   	      {
   	      System.out.println("element found");
   	      }
   	      else if(arr[mid]>element)
	       {
   		
	          last=last-1;
		       bin_search(arr,element,first,last);
	        }
   	       else if(arr[mid]>element)
	          {   first=first+1;
		          bin_search(arr,element,first,last);
	          }
   	      else
        	{
   		       System.out.println("element not found");
   	       }
        }
}