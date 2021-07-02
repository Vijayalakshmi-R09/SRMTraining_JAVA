package generics;

import java.util.Stack;

public class StackGeneric {

	
    static void stackPush(Stack<Integer> s)
    {
        for(int i = 2; i < 10; i++)
        {
            s.push(i);
        }
        System.out.println("Pushed Elements:"+s);
    }
      
 
    static void stackPop(Stack<Integer> s)
    {
        System.out.println("Pop Operation (one by :");
  
        for(int i = 0; i < 5; i++)
        {
            Integer y = (Integer) s.pop();
            System.out.println(y);
        }
    }
  

    static void stackPeek(Stack<Integer> s)
    {
        Integer element = (Integer) s.peek();
        System.out.println("Element on stack top: " + element);
    }
      
 
    static void stackSearch(Stack<Integer> s, int element)
    {
        Integer pos = (Integer) s.search(element);
  
        if(pos == -1)
            System.out.println("Element "+element+" not found in stack");
        else
            System.out.println("Element "+element+" is found at position: " + pos);
    }
  
  
    public static void main (String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        
        stackPush(stack);
        stackPop(stack);
        stackPush(stack);
        stackPeek(stack);
        stackSearch(stack, 2);
        stackSearch(stack, 6);
        stackSearch(stack,0);
    }
}
