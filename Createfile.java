import java.io.*;

class Createfile
{
	public static void main(String args[])
	{
		File newFile = new File("D://Java//Arati//Hi.txt"); 
		
		try
		{
			newFile.createNewFile();
			System.out.println("File Created Successfully");
		}
		catch(Exception e)
		{
			System.out.println("Error occured!" +e);
		}
	}
}