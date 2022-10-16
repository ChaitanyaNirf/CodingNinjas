import java.util.*;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		
        Scanner s = new Scanner(System.in);
        
        int input = s.nextInt();
        
        for(int i=input;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(i);
            }
            System.out.println();
        }
		
	}

}
