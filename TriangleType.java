import java.util.Scanner;

public class TriangleType{
	public static void main(String arg[]){

		Scanner sc = new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		if(a==b && a==c ){
			System.out.println("Isoscele Triangle");
		}
		else if((a==b ) || (b==c) || (c==a)){
			System.out.println("Equilator Triangle");
		}
		if(((a*a)+(b*b))==c*c || (b*b +c*c)==a*a || ( a*a +c*c) == b*b )
		{
			System.out.println("Right Angle Triangle");
		}
	}
}