import java.util.Scanner;

public class Higest{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a>b){
			if(a>c){
				System.out.println(a+" is Greatest");
			}
			else{
				System.out.println(c+" is Greatest");
			}
		}else{
			if(b>c){
				System.out.println(b+" is Greatest");
			}
			else{
				System.out.println(c+" is Greatest");
			}
		}
	}
}