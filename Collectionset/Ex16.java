package Collectionset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex16 
{

	public static void main(String[] args) 
	{
		//iterate through all elements in linked hash set 
		LinkedHashSet ls=new LinkedHashSet();
		ls.add(2);
		ls.add(2);
		ls.add(null);
		ls.add(3);
		ls.add(4);
		ls.add(1);
		Iterator i= ls.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
