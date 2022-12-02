/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccount;

/**
 *
 * @author rodri
 */
public class Account {
    
    String owner;
    double balance;
    
    Account(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }
    
    void deposit(double amount){
        balance = balance + amount;
    }
    void withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient funds!");
            return;
        }
        
        
        
        balance = balance - amount;
    }
    
    void display (){
       System.out.println("=========================================");
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance); 
        System.out.println("=========================================");
    }
}
