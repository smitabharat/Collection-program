package Collectionset;

import java.util.HashSet;

public class Ex17main 
{

	public static void main(String[] args) 
	{
		HashSet<Employees>hs=new HashSet();
		Employees e1=new Employees();
		Employees e2=new Employees();
		Employees e3=new Employees();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		
		System.out.println(hs);
		
		
		

	}

}
