package Java_Basic;
import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		a = a+b;
		b=a-b;
		a=a-b;
		System.out.println(a + " " + b);
	}

}