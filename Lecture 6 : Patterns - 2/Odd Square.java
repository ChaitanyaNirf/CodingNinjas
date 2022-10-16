import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++) {
            int odd=2*i-1;
            for(int j=n;j>=i;j--) {
                System.out.print(odd);
                odd=odd+2;
            }
            int p=1;
            for(int j=1;j<=i-1;j++) {
                System.out.print(p);
                p=p+2;
            }
            System.out.println();
        }
	}
}
