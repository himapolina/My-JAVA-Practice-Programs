class Account
{
    String cust_name;
    int acc_no;
    double balance;
    String type_of_account 
    public void withdraw()
    {
    }
    public void deposit()
    {
    }
    public void display()
    {
    }
    public void updateBal()
    {
    }
}
class Current extends Account
{
    double servicecharge;
    String chequebook;

    public void issueCheque()
    {
    }
    public void checkBal()
    {
    }
    public void imposePenalty()
    {
    }
}
class Saving extends Account
{
    double interest;
    public void computeInterest()
    {
    }
    public void depositInterest()
    {
    }   
}