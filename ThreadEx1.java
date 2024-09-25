import java.io.*;
import java.util.*;

//Sample code to create Threads by Extending Thread Class:
public class ThreadEx1 extends Thread 
{
    public void run()
    {
        System.out.println("Thread Started Running...");
    }
    public static void main(String[] args)
    {
        ThreadEx1 t1 = new ThreadEx1();
        t1.start();
    }
}