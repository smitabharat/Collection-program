package Collectionset;

import java.util.TreeSet;

public class Ex7 {

	public static void main(String[] args) 
	{
		//get first and last element in treeset
		TreeSet t=new TreeSet();
		t.add(3);
		t.add(5);
		t.add(8);
		t.add(9);
		t.pollFirst();
		t.pollLast();

	}

}
