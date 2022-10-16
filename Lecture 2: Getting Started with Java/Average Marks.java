import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
	
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = str.charAt(0);
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();
        System.out.println(c);
        System.out.println((m1+m2+m3)/3);
		
	}

}
