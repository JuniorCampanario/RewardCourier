package rewardcourier;

import java.util.Scanner;

public class Courier {
    
    private String name;
    private String id;
    private int delivery, like, dislike;
    
    Scanner scan = new Scanner(System.in);

    public Courier (String name, String id){
        
        this.name = name;
        this.id = id;
        delivery = 0;
        like = 0;
        dislike = 0;
    }

    public void AddDelivery (int qtd){
    
        delivery += qtd;
        System.out.println("Currently Status: " + delivery + "\n");
    }

    public void AddLike (int qtd){
    
        like += qtd;
        System.out.println("Currently Status: " + like + "\n");
    }
    
    public void AddDislike (int qtd){
    
        dislike += qtd;
        System.out.println("Currently Status: " + dislike + "\n");
    }
    
        public void CurrentlyStatus(){
        System.out.println("\n       CURRENTLY STATUS (AMOUNT) \n");
        System.out.println("NAME: " + this.name);
        System.out.println("ID: " + this.id + "\n");
        
        System.out.println("DELIVERY: " + delivery);
        System.out.println("LIKE: " + like);
        System.out.println("DISLIKE: " + dislike + "\n");
    }

    public void Menu(){
        
        System.out.println("\n*************** CHOOSE AN OPTION *************** \n");
        System.out.println("1 - DELIVERY");
        System.out.println("2 - LIKES");
        System.out.println("3 - DISLIKES");
        System.out.println("4 - STATUS");
        System.out.println("5 - SAIR\n");
        System.out.print("OPTION: ");
    }
    
    public void Begin(){
        int option;
        do{
            Menu();
            option = scan.nextInt();
            ChooseOption(option);
        }while(option!=5);
    }

    public void ChooseOption(int option){
        int qtd;
        
        switch(option){
            case 1:    
                    System.out.print("How Many DELIVERY the courier made today? ");
                    qtd = scan.nextInt();
                    AddDelivery(qtd);
                    break;
            case 2: 
                    System.out.print("How many LIKES did the courier receive today? ");
                    qtd = scan.nextInt();
                    AddLike(qtd);
                    break;
            case 3:
                    System.out.print("How many DISLIKES did the courier receive today?");
                    qtd = scan.nextInt();
                    AddDislike(qtd);
                    break;
            case 4:
                    CurrentlyStatus();
                    break;
            case 5: 
                    System.out.println("Closed System.");
                    break;
                    
            default:
                    System.out.println("Invalid Option !!!");
        }
    }
    
    
}
