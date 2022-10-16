import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner scanner = new Scanner(System.in);
        double basicSal = scanner.nextDouble();
        String grade = scanner.next();
        int allow = 1300;
        if(grade.equals("A")) allow = 1700;
        else if(grade.equals("B")) allow = 1500;
        
        double hra = (basicSal*20)/100;
        double da = (basicSal*50)/100;
        double pf = (basicSal * 11)/100;
        double total = basicSal + hra + da - pf + allow;
        System.out.println((int) Math.round(total));
        // System.out.println(hra +" "+da +" "+pf +" "+total);
	}
}
