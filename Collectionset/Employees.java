package Collectionset;
import java.util.*;

public class Employees
{
	int id;
	String name;
	double salary;
	
	
	public Employees()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id ,name,salary");
		id=sc.nextInt();
		name=sc.next();
		salary=sc.nextDouble();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	

}
