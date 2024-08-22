import java.util.Scanner;
class Exc1
{
    public static void main(String args[])
    {
        System.out.println("Program is started");
        int a=10,b=0,c;
        try 
        {
            c=a/b;
            System.out.println(c);
        } 
        catch (Exception e) 
        {
            System.out.println("Exception is found");
            System.out.println(e);
            System.out.println();

        } 

        int arr[]=new int[5];
        int div;
        int rem[]=new int[5];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter five divident: ");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter thr divisor greater than zero");
        div=sc.nextInt();
        if(div>0)
        {
            for(int i=0;i<5;i++)
            {
                rem[i]=arr[i] % div;
                System.out.println(rem[i]);
            }
        }   
        else
        {
            System.out.println("please enter divisor greater than zero");
        }    

        System.out.println("Program is ended");
    }
}