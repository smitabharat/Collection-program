package CollectionMap;

import java.util.HashMap;

public class Ex7 
{

	public static void main(String[] args) 
	{
		// get only the values from a hash map
		HashMap h=new HashMap();
		h.put(1,"abc");
		h.put(2, "pqr");
		h.put(3, "omn");
		
		System.out.println(h.values());
		

	}

}
