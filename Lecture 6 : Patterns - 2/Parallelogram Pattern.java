import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = row;
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) 
			    	if(j!=1)System.out.print(" ");
			for (int j = 1; j <= col; j++) 
				System.out.print("*");
			System.out.println();
		}
	}
}
