package enfusion;

	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class Stack {
	   
	    static ArrayList<String> stack = new ArrayList<String>();
	    
	    public static void main(String[] args)  {
	    	Stack S = new Stack();
	    	S.push("4");
	    	S.pop();
	    	S.push("3");
	    	S.push("5");
	    	S.push("2");
	    	
	    	
	    	for(int i = 0; i <stack.size(); i++){
	    		System.out.println(stack.get(i));
	    	}
	    	
	    }
	    static void superStack(String[] operations) {
	    	LinkedList<String> list = new LinkedList<String>();
	    	if(operations.length == 0){
	    		System.out.println("EMPTY");
	    	}
	    	
	    	for(int i = 0; i < operations.length; i++){
	    		String current = operations[i];
	    		if(current.equals("pop")){
	    			if(list.size() == 0)	System.out.println("EMPTY");
	    			else list.remove(list.size() - 1);
	    		}
	    		else if(current.startsWith("push")){
	    			//list.add(0, Integer.parseInt(current[0]));
	    		}
	    	}
	    }

	    public static void push(String s){
	    	stack.add(0,s);
	    	System.out.println("push " + s);
	    }
	    

	    public static void pop(){ 
	    	if(stack.size() == 0){
	    		System.out.println("EMPTY");
	    	}
	    	stack.remove(0);
	    }

	    public static void inc(int k, int inc){
	    	//for(int i = 0)
	    }
	   
}
