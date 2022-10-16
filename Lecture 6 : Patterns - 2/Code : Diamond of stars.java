import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		
        Scanner s = new Scanner(System.in);
        int minput = s.nextInt();
        int input = minput/2 + 1;
        int number = minput - input+1;
        
        for(int i=1;i<=input;i++){
            for(int j=1;j<2*input;j++){             
                if(j<=input-i) System.out.print(" ");
                else{
                    for(int k = 1;k<2*i;k++){
                        System.out.print("*");
                    }
                    break;
                }
            }
            System.out.println();
        }
        
		for (int m = number - 1; m > 0; m--) {
            for (int n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
		

