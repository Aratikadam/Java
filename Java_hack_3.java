import java.util.Scanner;

class Java_hack_3 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value for N: ");
        int N= sc.nextInt();
        if(1<=N && N<=100)
        {
            if(N%2==0)
            {
                if(N>=2 && N<=5)
                {
                    System.out.println("Not Weird");
                }
                else if(N>=6 && N<=20)
                {
                    System.out.println("Weird");
                }
                else 
                {
                    System.out.println("Not Weird");
                }
            }
            else
            {
                System.out.println("Weird");
            }
        }
        sc.close();

    }
}
