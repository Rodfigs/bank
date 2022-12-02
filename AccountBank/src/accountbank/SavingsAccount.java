/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountbank;

/**
 *
 * @author rodri
 */
public class SavingsAccount {
    String owner;
    double balance;
    double annualInterestRate;
    double checkAmount;
    
    
    
    
    
    SavingsAccount(String owner, double balance, double annualInterestRate){
        this.owner = owner;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    
    
    
    void deposit(double amount){
        balance = balance + amount;
    }
    
    
    void depositMonthlyInterest(){
        
        double monthlyInterest = annualInterestRate / 12;
        
        double tempbalance = monthlyInterest * balance;
        
        
        balance = tempbalance + balance;
    
    }
    void withdraw(double amount){
        if (amount > balance){
            
            
            System.out.print("I'm sorry you do not have enough money to withdraw.");
            
            
            
            return;
        }
        
        
        
        balance = balance - amount;
    }
    
//    void annualInterestRate() {
//    
//    }
    
  
}
