import java.util.*;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		
        Scanner s = new Scanner(System.in);
        
        int input = s.nextInt();
        
        for(int i=1;i<=input;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(i+63+j));
            }
            System.out.println();
        }
		
	}

}
