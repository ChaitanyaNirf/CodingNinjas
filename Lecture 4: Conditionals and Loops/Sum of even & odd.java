import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        String str = String.valueOf(input);
        int sodd = 0;
        int seven = 0;
        for(int i =0;i<str.length();i++){
            int temp = Character.getNumericValue(str.charAt(i));
           	if(temp%2 == 0) seven += temp;
            else sodd += temp;
        }
        
        System.out.println(seven +" "+ sodd);
	}
}
