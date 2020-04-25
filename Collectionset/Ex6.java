package Collectionset;

import java.util.HashSet;

public class Ex6 {

	public static void main(String[] args) 
	{
		// get element of hashset
		
		HashSet hs=new HashSet();
		hs.add(2);//duplicate not allowed
		hs.add(2);
		hs.add(1);//asending order taking
		hs.add(6);
	
		System.out.println(hs.size());

	}

}
