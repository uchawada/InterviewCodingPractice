package practice;
import java.util.function.Function;

public class NestedFunc2 {
  static Function<Integer,String> f (int x) {
    Function<Integer,String> g = y -> { 
      System.out.format ("x = %d, y = %d%n", x, y); 
      return "dummy";
    };
    g.apply (0);
    return g;
  }

  public static void main (String[] args) {
    Function<Integer,String> h = f (5);
    h.apply (0);
    f (6); 
    h.apply (0);
  }
}