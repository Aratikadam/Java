import java.util.Scanner;

class Arithmetic
{
	public static void main(String[] args)
	{

		int a,b,sum,sub,multi,div;

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the first number: ");
		a=sc.nextInt();

		System.out.println("Enter the second number: ");
		b=sc.nextInt();

		sum=a+b;
		System.out.println("Addition is " +sum);

		sub=a-b;
		System.out.println("Subtraction is " +sub);

		multi=a*b;
		System.out.println("Multiplication is " +multi);
		
		div=a/b;
		System.out.println("Division is " +div);
		
	}
}
