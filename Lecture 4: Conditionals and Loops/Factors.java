import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        for(int i=2;i<input;i++){
            if(input%i==0) System.out.print(i +" ");
        }
    }
}
