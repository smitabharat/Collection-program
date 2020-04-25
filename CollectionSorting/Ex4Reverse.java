package CollectionSorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex4Reverse {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		ListIterator i=al.listIterator(al.size());
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}

	}

}
