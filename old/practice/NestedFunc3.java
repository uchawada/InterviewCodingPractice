package practice;

import java.util.*;
import java.util.stream.Collectors;

public class NestedFunc3 {
  static <X> void print (List<X> list) {
    list.forEach (x -> System.out.println (x));
  }
  public static void main (String[] args) {
    List<Integer> l = new ArrayList<> ();
    for (int i = 0; i < args.length; i++) {
      l.add (Integer.parseInt (args[i]));
    }
    l = l.stream ().map (x -> x + 1).collect (Collectors.toList ());
    print (l);
  }
}