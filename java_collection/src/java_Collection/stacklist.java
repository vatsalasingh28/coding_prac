package java_Collection;
import java.io.*;
import java.util.*;
public class stacklist {
     public static void main(String args[])
     {
    	 Stack<Integer> stack =new Stack<Integer>();
    	 insertion(stack);
    	 pop(stack);
    	 search(stack,2);
     }
     static void insertion(Stack<Integer> stack)
     {
    	 for(int i=0;i<5;i++)
    	 {
    		 stack.push(i);
    	 }
     }
     static void pop(Stack<Integer> stack)
     {
    	Integer y =(Integer) stack.pop();
    	System.out.println("Deleted element is "+ y );
     }
     static void search(Stack<Integer> stack, int element)
     {
    	 Integer pos=(Integer) stack.search(element);
    	 if(pos== -1)
    		 System.out.println("Element is not present" );
    	 else
    		 System.out.println("Element is present at position" + pos);
     }
}