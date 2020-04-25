package CollectionMap;

import java.util.TreeMap;

public class Ex12 
{

	public static void main(String[] args) 
	{
		// wp to get the first key and last key
		
		TreeMap t=new TreeMap();
		t.put(1, 45);
		t.put(32, 34);
		t.put(30, 67);
		t.put(4, 78);
		
		System.out.println(t.firstKey());
		System.out.println(t.lastKey());

	}

}
