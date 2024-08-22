class Dividezeroexc
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

        } 
        System.out.println("Program is ended");
    }
}