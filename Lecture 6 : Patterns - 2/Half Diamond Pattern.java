import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        
        Scanner s = new Scanner(System.in);
        
        int input = s.nextInt();
        
        //upper half
        System.out.println("*");
        for(int i=1;i<input+1;i++){
        	String str = "*";
            int temp = 1;
            while(temp!=i){
                str+=temp;
                temp++;
            }
            while(temp!=0){
                str+=temp;
                temp--;
            }
            System.out.println(str+"*");
            
        }
        //lower half
        for(int i=input-1;i>0;i--){
            String str = "*";
            int temp = 1;
            while(temp!=i){
                str+=temp;
                temp++;
            }
            while(temp!=0){
                str+=temp;
                temp--;
            }
            System.out.println(str+"*");
            
        }
        
        System.out.println("*");
        
    }
}
