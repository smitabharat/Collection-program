package CollectionMap;

import java.util.TreeMap;

public class Ex11 
{

	public static void main(String[] args) 
	{
		//get first key and last key with value
		TreeMap t=new TreeMap();
		t.put(1, 45);
		t.put(32, 34);
		t.put(30, 67);
		t.put(4, 78);
		//t.ceilingEntry(key)
		System.out.println(t);
		
		System.out.println(t.lastEntry());

		System.out.println(t.lastKey());
	}

}
