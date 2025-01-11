import java.util.*;
class SimpleInterest{
	public static float calculateSimpleInterest(int principal, int rate, int time){
		// Calculate Simple Interest
		return ((principal * rate * time) / 100);
	}		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking user input for principal, rate, time
		int principal = sc.nextInt();
		int rate = sc.nextInt();
		int time = sc.nextInt();
		
		// calculate the simple interest
		float simpleInterest = calculateSimpleInterest(principal,rate,time);
		
		// Display output 
		System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + " Rate of Interest "+ rate + " and Time " + time);
		
		// Close Scanner Class
		sc.close();
	}
}