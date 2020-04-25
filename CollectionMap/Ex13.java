package CollectionMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

//sort keys in tree map by use comparator

class Sort implements Comparator<Sort>
{
	String key,values;
	

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValues() {
		return values;
	}
	public void setValues(String values) {
		this.values = values;
	}

	public int compare(Sort s1, Sort s2)
	{
		return (s1.getKey().compareTo(s2.getKey()));
	}
}

public class Ex13 
{

	public static void main(String[] args) 
	{
		TreeMap<String,String>t=new TreeMap<>();
		for(int i=0;i<5;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter key and value");
			String key=sc.next();
			String value=sc.next();
			t.put(key, value);
		}
		
		ArrayList al=new ArrayList<>(t.keySet());
		Collections.sort(al);
		System.out.println(al);

	}

}


