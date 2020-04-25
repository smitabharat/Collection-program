package Collectionset;

import java.util.TreeSet;

public class Ex10 
{

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		//t.add(null);//null cannot takr
		t.add(2);
		t.add(2);//duplicates not allowed
		//t.add("smit");//only one datatype value take.
		System.out.println(t);
		t.remove(2);
		System.out.println(t);

	}

}
