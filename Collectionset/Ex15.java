package Collectionset;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Ex15 
{

	public static void main(String[] args)
	{
		//first and last element
		LinkedHashSet ls=new LinkedHashSet();
		ls.add('w');
		ls.add('e');
		ls.add('o');
		ls.add('x');
		System.out.println(ls);
		TreeSet t=new TreeSet(ls);
		System.out.println(t.first()+" "+t.last()+" ");
		

	}

}
