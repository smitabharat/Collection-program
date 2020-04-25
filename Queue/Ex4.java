package Queue;

import java.util.ArrayDeque;

public class Ex4 
{

	public static void main(String[] args) 
	{
		ArrayDeque pq=new ArrayDeque();
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		System.out.println(pq);
		pq.removeAll(pq);
		System.out.println(pq);

	}

}
