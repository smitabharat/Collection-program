package CollectionMap;

import java.util.TreeMap;

public class Ex5 {

	public static void main(String[] args) 
	{
		//get all keys from the given a tree map
		TreeMap t=new TreeMap();
		t.put(1, 23);
		t.put(2, 78);
		t.put(3, 65);
		t.put(4, 76);
		System.out.println(t.keySet());

	}

}
