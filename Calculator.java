import java.util.Scanner;

public class Calculator{
	public static void main(String[] arg){

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		char choice=sc.next().charAt(0);

		switch (choice){

			case '+':
				System.out.println(a+" + "+b+" = "+(a+b));
				break;

			case '-':
				System.out.println(a+" - "+b+" = "+(a - b));
				break;
				
			case '*':
				System.out.println(a+" * "+b+" = "+(a*b));
				break;
				
			case '/':
				double ans=(double)a/(double)b;
				System.out.println(a+" / "+b+" = "+(ans));
				break;
			
			default:
				System.out.println("Invalid Operation ...");


		}
	}
}