package Queue;

import java.util.*;

public class Emp
{
	int id;
	String name;
	double salary;


	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\nEmployees [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	

}

