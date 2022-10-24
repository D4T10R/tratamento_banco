package principal;

import java.util.Scanner;

import entities.entities.Account;
import exception.DomainException;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        try {
            System.out.print("\nEnter amount for withdraw: ");
            account.withdraw(sc.nextDouble());
            System.out.println("New balance: " + account.getBalance());
        }
        catch (DomainException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }

}
