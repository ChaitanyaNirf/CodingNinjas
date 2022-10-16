import java.util.*;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		
        Scanner s = new Scanner(System.in);
        
        int input = s.nextInt();
        
        for(int i=65+input;i>65;i--){
            for(int j =i;j<=65+input;j++){
            	System.out.print((char) (j-1));     
            }
            System.out.println();
        }
		
	}

}
