package stack;

import java.util.Iterator;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new StackLiFo();
		
		
		if(stack.isEmpty()) 
			System.out.println("Stack is empty");
		
		stack.push("First try"); 
		stack.push("Second try");
		stack.push("Third try");
		
		System.out.println(stack.peek()); 
		
		System.out.println("Size :"+stack.size()+ "\n"); 
		
		System.out.println(stack.pop());		
		System.out.println(stack.pop());
		
		System.out.println("Size after pop :"+stack.size()); 
		System.out.println("___________________________________\n");
		
		Iterator <Object> ite = stack.iterator(); 
		System.out.println("Printing all of the elements: "); 
		
		while(ite.hasNext()){ 
		System.out.println(ite.next()); 
		}	
	
}
}