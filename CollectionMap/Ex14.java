package CollectionMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex14 
{

	public static void main(String[] args) 
	{
		// 
		HashMap<Student,Integer>t=new HashMap();
		Student e=new Student();
		Student e1=new Student();
		Student e2=new Student();
		
		t.put(e,15);
		t.put(e1,60);
		t.put(e2,18);
		
		Set<Entry<Student,Integer>> s=t.entrySet();
		
		ArrayList<Student> pass=new ArrayList();
		ArrayList<Student> fail=new ArrayList();
		
		Iterator i=s.iterator();

		while(i.hasNext())
		{
			Entry l=(Entry) i.next();
			if((int)l.getValue()>35)
			{
				pass.add((Student) l.getKey());
			}
			else
			{
				fail.add((Student) l.getKey());
			}
		}
		System.out.println("pass students"+pass);
		System.out.println("fail students"+fail);
	}

}
