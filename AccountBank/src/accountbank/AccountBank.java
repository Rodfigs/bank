/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accountbank;

/**
 *
 * @author rodri
 */





public class AccountBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CheckingAccount emilyAccount = new CheckingAccount("Emily", 200, 10);
        SavingsAccount joeAccount = new SavingsAccount("Joe", 100, 1);
        
        emilyAccount.deposit(50);
        System.out.println(emilyAccount.balance);
        joeAccount.withdraw(25);
        System.out.println(joeAccount.balance);
        emilyAccount.processCheck(50);
        System.out.println(emilyAccount.balance);
        emilyAccount.withdraw(100);
        System.out.println(emilyAccount.balance);
        joeAccount.deposit(100);
        System.out.println(joeAccount.balance);
        SavingsAccount samAccount = new SavingsAccount("Sam", 250, .05);
        System.out.println(samAccount.balance);
        joeAccount.depositMonthlyInterest();
        joeAccount.deposit(100);
        samAccount.depositMonthlyInterest();
        System.out.println(samAccount.balance);
        emilyAccount.withdraw(500);
        System.out.println(emilyAccount.balance);
        joeAccount.withdraw(500);
        System.out.println(joeAccount.balance);
     
        
        
        
    }
    
}
