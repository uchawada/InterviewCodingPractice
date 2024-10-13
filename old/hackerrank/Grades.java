package hackerrank;

public class Grades {

	public static void main(String[] args){
		
		int grade[] = {73, 67, 38, 33};
//		for(int i = 0; i < grade.length; i++){
//			//grade[i] = round(grade[i]);
//			System.out.println(grade[i]);
//		}
		
		System.out.println("Round73 " + round(73));
		System.out.println("Round38 " + round(38));

		grades(grade);
	}
	
	public static int[] grades(int[] grades){
		int round[] = new int[grades.length];
	
		for(int i = 0; i < grades.length; i++){
			if(round(grades[i]) - grades[i] >= 3 || grades[i] < 38){
				round[i] = grades[i];
			}
			
			else round[i] = (int) round(grades[i]);
		}
		for(int i = 0; i < round.length; i++){
			System.out.println(round[i]);
		}
		return round;
		
	}
	
	public static double round(double n){
		return 5 * Math.ceil(n/5.0);
		
		
//		double answer = num * 5.0;
//		return answer; 
	}
}
