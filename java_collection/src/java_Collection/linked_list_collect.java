package java_Collection;
import java.util.*;

public class linked_list_collect {

	public static void main(String[] args) {
    LinkedList<String> object= new LinkedList<String>();
    		object.add("A");
            object.addLast("D");
            object.add(1, "R");
            object.addFirst("S");
            
            object.remove("S");
            
            boolean status=object.contains("A");
            if(status)
            	System.out.println("Linked list contains A");
            else
            	System.out.println("linked list does not cointains A");
	}

}
