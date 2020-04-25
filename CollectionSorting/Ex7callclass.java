package CollectionSorting;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Collectionset.Employees;

public class Ex7callclass 
{

	public static void main(String[] args) 
	{
		ArrayDeque<Ex7Emp> ad=new ArrayDeque();
		Ex7Emp e1=new Ex7Emp();
		Ex7Emp e2=new Ex7Emp();
		Ex7Emp e3=new Ex7Emp();
		ad.add(e1);
		ad.add(e2);
		ad.add(e3);
		
	
		 ArrayList<Ex7Emp> ar=new ArrayList(ad);
			/** System.out.println("using comparable name sorting"); //Collections.sort();
		 * System.out.println(ar);
		 */
		
		System.out.println("using comparator salary");
		Collections.sort(ar, new Ex7SalarySort());
		System.out.println(ar);
		
		System.out.println("using comparator name sorting");
		Collections.sort(ar, new Ex7Namesort());
		System.out.println(ar);
		

	}

}
