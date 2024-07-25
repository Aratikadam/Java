import java.util.Scanner;
class Emp_info
{
    int i;
    int emp_id[]=new int[5];
    String emp_name[]=new String[5];
    float emp_salary[]=new float[5];
    Scanner sc = new Scanner(System.in);
    void getData()
    {
        for(i=0;i<5;i++)
        {
            System.out.println("Enter the Employee Id: ");
            emp_id[i]=sc.nextInt();

            System.out.println("Enter the Employee Name: ");
            emp_name[i]=sc.next();

            System.out.println("Enter the Employee Salary: ");
            emp_salary[i]=sc.nextFloat();
        }
    }

    void displayData()
    {
        for(i=0;i<5;i++)
        {
            System.out.println((i+1)+ " Employee Information: ");

            System.out.println(" Employee Id: "+ emp_id[i]);

            System.out.println(" Employee Name: "+ emp_name[i]);

            System.out.println(" Employee Salary: "+ emp_salary[i]);

            System.out.println();
           
        }
    }
}
class Display_emp
{
    public static void main(String[] args)
    {
        Emp_info emp=new Emp_info();
        emp.getData();
        emp.displayData();
    }
}