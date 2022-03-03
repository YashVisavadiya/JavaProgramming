import java.util.Scanner;

public class IsVowel{
	public static void main(String[] a){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Character : ");
		char ch=sc.next().charAt(0);

		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
			System.out.println(ch+" is Vowel");
		}
		else{
			System.out.println(ch+" is Consonant");
		}
	}
}