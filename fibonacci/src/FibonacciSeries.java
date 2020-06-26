import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {
		int k,a=1,b=1;
		Scanner scan=new Scanner (System.in);
		k=0;
		System.out.print("enter any number ");
		int n=scan.nextInt();
		System.out.print("1 1 ");
		while(k<=n) {
			k=a+b;
			System.out.print(k+" ");
			a=b;
			b=k;
			
		}
		
		
		
	}

}
