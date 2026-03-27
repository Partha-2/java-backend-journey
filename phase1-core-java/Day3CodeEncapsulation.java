class BankAccount{

    String owner;
    double balance;

    BankAccount(String owner,double balance){
        this.owner=owner;
        this.balance=balance;
    }


    //GETTER
    public String getOwner(){
        return owner;
    }

    public double getBalance(){
        return balance;
    }

    //Setter with validation
     public void setBalance(double balance){
        if(balance<0)
        {
            System.out.println("invalid amount");
        }
        else{
            this.balance=balance;
        }
     }

     public void showAccountBalance(){
        System.out.println(owner+":"+balance);
     }

}
public class Day3CodeEncapsulation{
    public static void main(String[] args)
    {
        BankAccount account1=new BankAccount("Partha",1100);
        BankAccount account2=new BankAccount("Sarathy",100);

        account1.showAccountBalance();
        account2.showAccountBalance();

        account1.setBalance(-100);
        account2.setBalance(+1000);

        System.out.println(account1.getOwner());
        System.out.println(account1.getBalance());
        System.out.println(account2.getOwner());
        System.out.println(account2.getBalance());
    }
}