package Collectionset;

import java.util.HashSet;
import java.util.Iterator;

public class Ex5 
{

	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		hs.add(null);
		hs.add("3");
		hs.add(6);
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
