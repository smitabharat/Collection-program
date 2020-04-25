package Collectionset;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex13 
{

	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		h.add("smit");
		h.add("pooja");
		h.add("aishu");
		h.add("sandhya");
		h.add("aashu");
		h.add("kiran");
		//System.out.println(h);
		TreeSet <String>t=new TreeSet<String>(h);
		System.out.println("tree set contains");
		for(String str:t)
		{
			System.out.println(str);
		}

	}

}
