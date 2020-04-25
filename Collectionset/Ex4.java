package Collectionset;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex4 
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(6);
		al.add(7);
		al.add(2);
		
		HashSet hs=new HashSet(al);
		System.out.println(hs);
		
		
	}

}
