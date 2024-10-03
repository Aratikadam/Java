import java.io.*;

class Writefile
{
    public static void main(String a[])
    {
        String text="Hello World!";

        try
        {
            FileWriter f= new FileWriter("D://Java//Arati//abc.txt");
            f.write(text);
            f.close();
            System.out.println("Successfully wrote in file");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}