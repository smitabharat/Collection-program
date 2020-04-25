package CollectionSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex6 
{
	//without using sort method sorting element 

	public static void main(String[] args) 
	{
	ArrayList<Integer> al=new ArrayList();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	 Object arr[]=al.toArray();
	 Arrays.sort(arr);
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.println(arr[i].toString());
			
	
			}
	}

}
