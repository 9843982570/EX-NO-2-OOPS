
package bank;
import java.util.Scanner;

public class Bank {

    
    
    public static void main(String[] args) {
        int n;
        int id =0;
        int balance =0;
        int i;
               
        String name = null;
        System.out.println("enter the no of account holders:");
        Scanner obj1=new Scanner(System.in);
        n=obj1.nextInt();
        account a[]=new account[n];
        
        
        for (i=0;i<a.length; i++) {
            System.out.println("enter the account holder name:");
            name = obj1.next();
            System.out.println("enter the id:");
            id = obj1.nextInt();
            System.out.println("enter the balance");
            balance = obj1.nextInt();
            
        }
        account  acc=new account(name,id,balance);
        
        acc.credit(500);
        acc.debit(500);
     
        acc.printAccountInfo();
        
       
    }
    
}
class account
{
    String name;
    int id;
    int balance;
    
    
    account(String name, int id, int balance)
    {
        this.name=name;
        this.id = id;
        this.balance=balance;
        
    }
    public void credit(double amount) {
        
       
        if (amount > 0) {
            balance += amount;
            System.out.println("Credited: " + amount);
        } else {
            System.out.println("Invalid credit amount.");
        }
    
    }
 
   
    public void debit(double amount) 
    {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Debited: " + amount);
        } else {
            System.out.println("Insufficient balance for debit.");
        }
    }
      public void printAccountInfo() {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Holder ID: " + id);
        System.out.println("Balance: " + balance);
        
        
    } 
          
}
