package Collectionset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Ex1 
{

	public static void main(String[] args) 
	{
		
		
		TreeSet t= new TreeSet();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		System.out.println(t);
		Iterator i=t.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
