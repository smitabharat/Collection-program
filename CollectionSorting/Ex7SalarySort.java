package CollectionSorting;

import java.util.Comparator;

public class Ex7SalarySort implements Comparator<Ex7Emp>
{


	public int compare(Ex7Emp sal1, Ex7Emp sal2) 
	{
		if(sal1.salary==sal2.salary)
		{
		return 0;
		}
		else
		
			if(sal1.salary<sal2.salary)
			{
			
				return 1;
		}
		else
			return-1;
	
	}

}
