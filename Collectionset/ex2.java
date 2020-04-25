package Collectionset;

import java.util.HashSet;

public class ex2 
{

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add(3);
		hs.add(3);//duplicates not allowed
		hs.add(5);
		hs.add(null);
		System.out.println(hs);
		
		

	}

}
