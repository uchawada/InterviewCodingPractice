package practice;

public class PrintMessage implements Runnable{
	final String message;
	
	PrintMessage (String message) {
		this.message = message;
	}
	
	public void run () {
		System.out.println (message);
	}
	
	public static void main(String[] args){
		PrintMessage p = new PrintMessage("Urvi Chawada");
		p.run();
		
		System.out.println(method(3));
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

