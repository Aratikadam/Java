import java.util.Scanner;

public class Arithmeticoperation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Choose an operation: ");

            System.out.println("1. Arithmetic operation: ");
            System.out.println("2. Statistical operation: ");
            System.out.println("3. Trignometric operation: ");
            System.out.println("4. Exit: ");

            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter two numbers: ");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    System.out.println("Sum: "+ (a+b));
                    System.out.println("Differnce: "+ (a-b));
                    System.out.println("Product: "+ (a*b));
                    System.out.println("Quotient: "+ (a/b));
                break;

                case 2:
                    System.out.println("Enter the count of numbers for calculating average: ");
                    int n=sc.nextInt();
                    System.out.println("Enter the numbers: ");
                    int[] arr=new int[n];
                    int sum=0;
                    for(int i=0;i<n;i++)
                    {
                        arr[i]=sc.nextInt();
                    }
                    for(int i=0;i<n;i++)
                    {
                        sum+=arr[i];
                    }
                    double avg=sum/n;
                    System.out.println("Average: "+avg);
                break;

                case 3:
                    System.out.println("Enter an angle in degrees: ");
                    double angle=sc.nextDouble();
                    double radians=Math.toRadians(angle);
                    System.out.println("Sine: "+ Math.sin(radians));
                    System.out.println("Cosine: "+ Math.cos(radians));
                    System.out.println("Tangent: "+ Math.tan(radians));
                break;

                case 4:
                    System.out.println("Exiting");
                    sc.close();
                    System.exit(0);
                break;

                default:
                    System.out.println("Wrong choice");
            }

        }

    }
}