import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        
        String str = s.nextLine();
        int c = str.charAt(0);
        
        if(c >= 65 && c<=90) System.out.println("1");
        else if(c>=97 && c<=122) System.out.println("0");
        else System.out.println("-1");
    }
}
