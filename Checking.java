public class Checking extends Account{
    private double overdrawmlimit = getBalance()/10;

    Checking() {}

    Checking(int id, double balance)
    {
        super(id, balance);
    }

    @Override
    public double withdraw(double a)
    {
        if(a<overdrawmlimit)
        {
            overdrawmlimit-=a;
            return overdrawmlimit;
        }
        else 
        {
            a-=overdrawmlimit;
            super.withdraw(a);
        }
        return getBalance();
    }
}
