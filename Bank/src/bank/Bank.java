package bank;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        String name;
        int amount;
        
        System.out.println("***** Register new Client ******");
        System.out.print("Enter with your name: ");
        Scanner scan = new Scanner(System.in);
        
        name = scan.nextLine();
        
        System.out.print("Enter with inicial amount: ");
        amount = scan.nextInt();
       
    }
    
}
