package Queue;

import java.util.PriorityQueue;

public class Ex2 
{

	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue();
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		System.out.println(pq);
		
		System.out.println(pq.poll());

	}

}
