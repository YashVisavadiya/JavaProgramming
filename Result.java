import java.util.Scanner;

public class Result{
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int s4=sc.nextInt();
		int s5=sc.nextInt();

		float res=(s1+s2+s3+s4+s5)/5;

		if(res<35){
			System.out.println("fail");
		}
		else if(res>=35 && res < 45){
			System.out.println("Pass");
		}
		else if(res>=45 && res<60){
			System.out.println("Second Class");
		}
		else if(res>=60 && res <70){
			System.out.println("First Class");
		}
		else{
			System.out.println("Distinction");
		}
	}
}