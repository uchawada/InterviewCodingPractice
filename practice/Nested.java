package practice;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Nested {
  public static void main (String[] args) {
	  
    List<Integer> l = new ArrayList<> ();
    l.add (1); l.add (2); l.add (3);
    Function<Integer,String> f;
    
	f = new Function<Integer,String> () { // anonymous inner class
      public String apply (Integer x) {return method(x); }
    };
	
    l.stream ().map (f)
     .collect (Collectors.toList ())
     .forEach (x -> System.out.println (x));
	 
	 
//	 method(3);
  }
  
 public static String method(int n){
	int i;
	String message = "";
	for(i = 0; i < n; i++){
		message += "x";
	}
	return message;
	}
}
