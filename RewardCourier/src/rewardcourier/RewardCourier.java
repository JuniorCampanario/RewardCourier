package rewardcourier;

import java.util.Scanner;

public class RewardCourier {

    public static void main(String[] args) {

        String name;
        String id;
        Scanner scan = new Scanner(System.in);
    
        //Obtendo os dados iniciais do Courier
        System.out.println("\n*************** REGISTER NEW COURIER ***************\n");
        System.out.print("NAME: ");
        name = scan.nextLine();
        System.out.print("ID: ");
        id = scan.nextLine();
        
        
        //Criando a conta de um courier
        Courier newCourier = new Courier (name, id);
        newCourier.Begin();
    }
    
}
