package CollectionMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex10 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap hs=new HashMap();
		hs.put(4, "smita");
		hs.put(1,"mayuri");
		hs.put(2, "shruti");
		System.out.println(hs);
		
		Set s=hs.keySet();
		
		//ArrayList al=(ArrayList) hs.values();
		
		System.out.println(hs.values());
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
