package unit3.practice3;

import java.util.Scanner;

public class Unit3Practice3 {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner (System.in);    
        int bigest = 0;
        int number[] = new int[5];
        
        for (int i = 0; i < number.length; i++){
        
            System.out.print("Enter the number: " );
            number[i] = scan.nextInt();
            
            if (i == 0){ // Para a variável bigest pegar o primeiro valor do loop (mesmo se for negativo)
                bigest = number[i]; 
            }
            
            if (number[i] > bigest ){  // Comparar o valor bigest com o numero digitado
                bigest = number[i];
            } 

            if (number[i] == -1){  // condição para finalizar o programa
                i = number.length;
            }
        }
        
        System.out.println("The bigest number is " + bigest);

    }
    
}
