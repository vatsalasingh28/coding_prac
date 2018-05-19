package java_Collection;
import java.io.*;
import java.util.*;

public class array_list {
    public static void main(String args[])
    {
    	int n=5;
    	ArrayList<Integer> arrli =new ArrayList<Integer>(n);
    	int i;
    	for(i=0;i<n;i++)
    	{
    		arrli.add(i);
    	}
    	System.out.println("size of arraylist is "+arrli.size());
    	arrli.remove(3);
    	System.out.println(arrli);
    }
}
