import java.util.Scanner;
class Information
{
    String name;
    String address;
    int prn; 

    Scanner sc=new Scanner(System.in);
    Information()
    {
        System.out.println("Enter the Name: ");
        name=sc.next();
        System.out.println("Enter the Address: ");
        address=sc.next();
        System.out.println("Enter the PRN: ");
        prn=sc.nextInt();

    }

    Information(String nm,String add,int id)
    {
        name=nm;
        address=add;
        prn=id;
    }
    void Display()
    {
        System.out.println("Name is "+name);
        System.out.println("Address is "+address);
        System.out.println("PRN is "+prn);
    }

    public static void main(String args[])
    {
        Information info=new Information();
        info.Display();
        Information info1=new Information("Arati","Chandur",305);
        info1.Display();
    }
}