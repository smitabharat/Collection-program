package Collectionset;

import java.util.HashSet;

public class Ex11 
{

	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		h.add(null);
		h.add(1);
		h.add("smit");
		h.add(2);
		h.add(2);
		System.out.println(h);
		h.removeAll(h);
		System.out.println(h);

	}

}
