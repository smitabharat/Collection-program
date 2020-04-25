package CollectionMap;

import java.util.TreeMap;

public class Ex4 {
	//get the key using value

	public static void main(String[] args) 
	{
		TreeMap t=new TreeMap();
		t.put(1, 23);
		t.put(2, 78);
		t.put(3, 65);
		t.put(4, 76);
		
		System.out.println(t.keySet());
		System.out.println(t.values());
	}

}
