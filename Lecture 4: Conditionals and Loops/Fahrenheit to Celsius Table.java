import java.util.*;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner scanner = new Scanner(System.in);
        
        int s = scanner.nextInt();
        int e = scanner.nextInt();
        int w = scanner.nextInt();
        for(int i=s;i<=e;i+=w){
            System.out.println(i + " "+convert(i));
        }
		
	}
    
    public static int convert(int far){
        return (5*(far-32))/9;
    }

}
