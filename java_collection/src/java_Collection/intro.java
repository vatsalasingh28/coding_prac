package java_Collection;
import java.util.*;
import java.io.*;
public class intro {
		public static void main(String args[])
		{
			Vector<Integer> v= new Vector();
			Hashtable<Integer ,String> h= new Hashtable();
			v.addElement(1);
			v.addElement(2);
			h.put(1,"aba");
			h.put(2, "qwert");
			System.out.println(v.elementAt(0));
			System.out.println(h.get(1));
		}
	}


