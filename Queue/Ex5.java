package Queue;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;



public class Ex5 
{

	public static void main(String[] args) 
	{
	ArrayDeque<Emp> pq=new ArrayDeque();
	
	for(int i=0; i<3; i++)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id ,name,salary");
		int id=sc.nextInt();
		String name=sc.next();
		Double salary=sc.nextDouble();
		pq.add(new Emp(id, name, salary));
	}

	
//	System.out.println(pq.add(e));
//	System.out.println(pq.add(e1));
//	System.out.println(pq.add(e2));
	
	System.out.println(pq);
	
	

	}

}
