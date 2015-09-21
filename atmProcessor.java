import java.util.Scanner;

public class atmProcessor {
  public static void main(String args[]){
  
    int pin, account_type = 0, transaction_type = 0, amount;
    
    Scanner in = new Scanner(System.in);
    try{
      System.out.println("Please Enter Your PIN");
      pin = Integer.parseInt(in.nextLine());
    
      System.out.println("Choose the Type of Account");
      System.out.println("1. Current Account  2. Savings Account");
      account_type = Integer.parseInt(in.nextLine());
      
      System.out.println("What Type of Transaction?\n 1. Balance Enquiry  2. Cash Withdrawal");
      transaction_type = Integer.parseInt(in.nextLine());
    }
    catch(NumberFormatException e){
      System.out.println("Please Enter an Integer");
    }
    
    
    if(transaction_type==1){
      if(account_type==1){
        System.out.println("You have 4000 GHS in your Current Account");
      }
      else{
        System.out.println("You have 50000 GHS in your Savings Account");
      }
    }
    else{
      System.out.println("Enter the Amount you wish to Withdraw");
      amount = Integer.parseInt(in.nextLine());
      System.out.println("Pick your " + amount + " GHS");
    }
  }
}
