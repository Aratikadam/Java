class SavingAccount
{
    private double SavingsBalance;
    private static double AnnualInterestRate;

    SavingAccount(double balance)
    {
        this.SavingsBalance=balance;
    }

    void calculateInterset(double AnnualInterestRate)
    {
        double MonthlyInterest=(SavingsBalance * AnnualInterestRate /12) / 100;
        SavingsBalance += MonthlyInterest;
    }

    static void ModifyInterestRate(double NewRate)
    {
        AnnualInterestRate = NewRate;
    }

    void show()
    {
        System.out.println("The amount is Rs " + SavingsBalance);
    }

    public static void main(String args[])
    {
        SavingAccount sever1= new SavingAccount(2000);
        SavingAccount sever2= new SavingAccount(3000);
        sever1.show();
        sever2.show();
        SavingAccount.ModifyInterestRate(4.0);
        sever1.show();
        sever2.show();
    }
}