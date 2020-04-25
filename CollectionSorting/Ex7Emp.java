package CollectionSorting;

import java.util.Scanner;

public class Ex7Emp 
{
int id;
String name;
double salary;

Ex7Emp()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id,name and salary");
	id=sc.nextInt();
	name=sc.next();
	salary=sc.nextDouble();
}

@Override
public String toString() {
	return "Ex7Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

	
}
