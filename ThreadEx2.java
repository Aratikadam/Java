import java.io.*;
import java.util.*;

//Sample code to create Thread by using Runnable Interface:  
public class ThreadEx2 implements Runnable 
{
    public void run()
    {
        System.out.println("Thread is Running Successfully");
    }

    public static void main(String[] args)
    {
        ThreadEx2 t2 = new ThreadEx2();
        Thread t1 = new Thread(t2);
        t1.start();
    }
}