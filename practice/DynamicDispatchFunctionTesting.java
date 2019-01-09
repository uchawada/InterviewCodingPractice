package practice;
//
//interface Fn {                 int apply (int x);                  }
//class F implements Fn { public int apply (int x) { return x + 1; } }
//class G implements Fn { public int apply (int x) { return x + 2; } }
//class H implements Fn { public int apply (int x) { return x + 3; } }
//
//public class DynamicDispatchFunctionTesting {
//  public static void main (String[] args) {
//    Fn[] fns = { new F (), new G (), new H () };
//    int[] data_arr = { 10, 11, 12, 13 };
//    for (int i = 0; i < fns.length; i++) {
//      for (int j = 0; j < data_arr.length; j++) {
//        int input = data_arr[j];
//        int output = fns[i].apply (input);
//        System.out.println ("  i = " + input + " -> o = " + output);
//      }
//    }
//  }
//}


//Anonymous inner classes in a loop 

interface Fn { int apply (int x); }

public class DynamicDispatchFunctionTesting {
  public static void main (String[] args) {
    Fn[] fns = new Fn[3];
    for (int i = 0; i < fns.length; i++) {
      final int j = i + 1; // Need a final var for inner class below
      fns[i] = new Fn () { public int apply (int x) { return x+j; } };
    }
    int[] data_arr = { 10, 11, 12, 13 };
    for (int i = 0; i < fns.length; i++) {
      for (int j = 0; j < data_arr.length; j++) {
        int input = data_arr[j];
        int output = fns[i].apply (input);
        System.out.println ("  i = " + input + " -> o = " + output);
      }
    }
  }
}





