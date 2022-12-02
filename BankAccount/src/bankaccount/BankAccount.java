/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankaccount;

/**
 *
 * @author rodri
 */
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account rodAccount = new Account("Rodrigo Figueroa", 20);
//        rodAccount.owner = "Rodrigo Figueroa";
//        rodAccount.balance = 20;
        
        rodAccount.deposit(80);
        rodAccount.withdraw(50);        
        rodAccount.withdraw(100); 
        
        System.out.println(rodAccount.balance);
        
        Account jiaAccount = new Account("Jia", 1000000);
//        jiaAccount.owner = "Jia";
//        rodAccount.balance = 10000000;
        
        System.out.println(jiaAccount.balance);
        
        jiaAccount.display();
    }
    
}
