package legacyrevision;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemEvenLenArr {

	public static void main(String[] args) 
	{
		try {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("Java");
		list.add("ReactJs");
		list.add("Angular");
		list.add("Python");
		list.add("Csharp");
		System.out.println("ArralyListElements: "+list);
		for(String i:list) 
		{
			int l=i.length();
			if(l%2==0) 
			{
				list.remove(i);
			}
		}
		System.out.println("After Remove Operation(using CopyOnWriteArrayList): "+list);
		//in ArrayList we cant modify (add r remove in during iteration if we do it throws current modification error
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Java");
		arr.add("ReactJs");
		arr.add("Angular");
		arr.add("Python");
		arr.add("Csharp");
		System.out.println("ArralyList Elements: "+arr);
		for(String i:arr) 
		{
			int l=i.length();
			if(l%2==0) 
			{
				arr.remove(i);
			}
		}
		System.out.println("After Remove Operation: "+arr);
		}
		catch(Exception e){
			System.out.println(e);		}
		
	}
}
