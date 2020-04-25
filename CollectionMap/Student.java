package CollectionMap;

import java.util.Scanner;

public class Student 
{

	int id;
	String name;
	//double mark;
	
	
	public Student()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id ,name");
		id=sc.nextInt();
		name=sc.next();
		//mark=sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", ]";
	}
	
	
	
	
}
