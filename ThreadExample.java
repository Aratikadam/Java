import java.io.*;
import java.util.*;

class Mythread extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread A Running: "+i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
        
} 

class Anotherthread extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread B Running: "+i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }

}

public class ThreadExample 
{
    public static void main(String args[])
    {
        Mythread t1=new Mythread();
        Anotherthread t2=new Anotherthread();
        t1.start();
        t2.start();
    }
}