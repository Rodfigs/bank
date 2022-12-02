/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountbank;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class CheckingAccount {
    String owner;
    double balance;
    double insufficientfeefund;
    double checkAmount;
    Scanner Equation = new Scanner(System.in);
    
    
    
    CheckingAccount(String owner, double balance, double insufficientfeefund){
        this.owner = owner;
        this.balance = balance;
        this.insufficientfeefund = insufficientfeefund;
    }
    
    void deposit(double amount){
        balance = balance + amount;
    }
    void withdraw(double amount){
        if (amount > balance){
            
            
            
            
            System.out.println("Insufficient funds! You will have to pay the penalty.");
            balance = balance - insufficientfeefund;
            
            
            
            return;
        }
        
        
        
        balance = balance - amount;
    }
    
    void processCheck(double checkAmount){
//        System.out.println("Enter check amount: ");
//        
//        
//        checkAmount = Equation.nextDouble();
        
        balance = balance + checkAmount;
    }
    
}
