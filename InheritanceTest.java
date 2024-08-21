import java.util.Scanner;

class Person
{
    String name;
    int birthdate;
    int height;
    int weight;
    String address;

    Scanner sc=new Scanner(System.in);
    void Setdata1()
    {
        System.out.println("Enter the Name: ");
        name=sc.next();
        
        System.out.println("Enter the Birth year: ");
        birthdate=sc.nextInt();

        System.out.println("Enter the Height: ");
        height=sc.nextInt();

        System.out.println("Enter the Weight: ");
        weight=sc.nextInt();

        System.out.println("Enter the Address: ");
        address=sc.next();

    }
    void Display1()
    {
        System.out.println("Name is "+name);
        System.out.println("Birth year is "+birthdate);
        System.out.println("Height is "+height);
        System.out.println("Weight is "+weight);
        System.out.println("Address is "+address);
    }
    void CalculateAge()
    {
        int age;
        age=2024-birthdate;
        System.out.println("Age is "+age);
    }

}

class Student extends Person
{
    int rollno;
    int m1,m2,m3;

    void Setdata2()
    {
        System.out.println("Enter the Roll number: ");
        rollno=sc.nextInt();

        System.out.println("Enter the marks of English: ");
        m1=sc.nextInt();

        System.out.println("Enter the marks of Maths: ");
        m2=sc.nextInt();

        System.out.println("Enter the marks of Science: ");
        m3=sc.nextInt();
    }

    void Display2()
    {
        System.out.println("The Roll Number is "+rollno);
        System.out.println("Marks of English is "+m1);
        System.out.println("Marks of Maths is "+m2);
        System.out.println("Marks of Science is "+m3);
    }

    void CalculateAvg()
    {
        int avg;
        avg=(m1+m2+m3)/3;

        System.out.println("The average marks are: "+avg);

    }

}

class Employee extends Person
{
    int empid;
    double salary;

    void Setdata3()
    {
        System.out.println("Enter the Employee Id: ");
        empid=sc.nextInt();

        System.out.println("Enter the Employee Salary: ");
        salary=sc.nextDouble();
    }
    void Display3()
    {
        System.out.println("The Employee Id is "+empid);
        System.out.println("The Employee Salary is "+salary);
    }
    void CalculateTax()
    {
        double tax;
        if(salary<=200000)
		    tax=0;
	    else if(salary<=300000)
	        tax=0.1*(salary-200000);
	    else if(salary<=500000)
		    tax=(0.2*(salary-300000))+(0.1*100000);
	    else if(salary<=1000000)
		    tax=(0.3*(salary-500000))+(0.2*200000)+(0.1*100000);
	    else
		    tax=(0.4*(salary-1000000))+(0.3*500000)+(0.2*200000)+(0.1*100000);
	    System.out.println("Income tax amount is "+tax);

    }
}

public class InheritanceTest 
{
    public static void main(String args[])
    {
        System.out.println("Displaying Person class: ");
        Person p=new Person();
        p.Setdata1();
        p.Display1();;
        p.CalculateAge();

        System.out.println("Displaying Student class: ");
        Student s=new Student();
        s.Setdata1();
        s.Setdata2();
        s.Display1();
        s.CalculateAge();
        s.Display2();
        s.CalculateAvg();

        System.out.println("Displaying Employee class: ");
        Employee e=new Employee();
        e.Setdata1();
        e.Setdata3();
        e.Display1();
        e.CalculateAge();
        e.Display3();
        e.CalculateTax();
    }    
}
