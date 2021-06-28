package generics;

import java.util.LinkedList;
import java.util.Queue;

public class QueueGeneric 
{
    public static void main(String[] args)
    {
       Queue<Integer> q  = new LinkedList<>();
       for (int i = 2; i < 10; i++)
       {
    	   
           q.add(i);
       }
       System.out.println("Elements of queue: "+ q+"\nSize: "+q.size());
       int rem = q.remove();
       System.out.println("Removed element: "+ rem);
       System.out.println(q);
       int head = q.peek();
       System.out.println("After Removal Head of queue: "+ head);
       int size = q.size();
       System.out.println("Size of queue: "+ size);
   }
}