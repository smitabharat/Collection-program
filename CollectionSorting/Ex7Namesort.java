package CollectionSorting;

import java.util.Comparator;

public class Ex7Namesort implements Comparator<Ex7Emp>
{

	
	public int compare(Ex7Emp o1, Ex7Emp o2)
	{
		
		return (o1.name).compareTo(o2.name);
	}

	
}
