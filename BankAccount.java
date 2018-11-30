/**
   A bank account has a balance that can be changed by deposits and withdrawals.
*/
public class BankAccount
{
   //instance variable for the balance of our bank account
   private double balance;
   
   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {
      balance = 0;
   }
   
   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initialBalance
   */
   
   public BankAccount(double intialBalance)
   {
      balance = initialBalance;
   }
   
   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   
   public void deposit(double amount)
   {
      double newBalance = balance + amount;
      balance = newBalance;
   }
   
   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   
   public void withdraw(double amount)
   {
      double newBalance = balance - amount;
      balance = newBalance;
   }
   
   /**
      Gets the current balance of the bank account
      @return the current balance
   */
   
   public double getBalance()
   {
      return balance;
   }
}