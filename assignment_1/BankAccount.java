package assignment_1;

public abstract class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountNumber, double balance, String accountHolderNumber){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.accountHolderName=accountHolderNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    protected void setBalance(double balance){
        this.balance=balance;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public void deposit (double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }
    public boolean withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            return true;
        }
        else{
            System.out.println("Insufficient funds or invalid withdrawal amount");
            return false;
        }
    }

    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }
}
