package CollectionMap;

import java.util.TreeMap;

public class Ex9 
{

	public static void main(String[] args) 
	{
		// wp to copy a tree map content to another tree map
		TreeMap t=new TreeMap();
		t.put(1,23);
		t.put(2,34);
		t.put(3, 45);
		t.put(5, 45);
		
		TreeMap t1=new TreeMap(t);
		System.out.println(t1);
		

	}

}
