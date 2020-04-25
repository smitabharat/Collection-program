package Collectionset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Ex9 
{

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		t.add(1);
		t.add(2);
		t.add(4);
		t.add(6);
		System.out.println(t);
		ArrayList al=new ArrayList(t);
		System.out.println("ListIterator previous");
		
		
		  /*Iterator i=t.iterator(); 
		  while(i.hasNext())
		  { 
			  System.out.println(i.next());
		 }*/
		 
		ListIterator l=al.listIterator(al.size());
		
		while(   l.hasPrevious())
		{
			System.out.println(l.previous());
		}

	}

}
