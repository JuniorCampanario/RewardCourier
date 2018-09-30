package unit3practice4;

import java.util.Scanner;

public class Unit3Practice4 {

    public static void main(String[] args) {
        
        int end = 0;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number you want to see the multiples of 3 ");
        end = scan.nextInt();
        
        for (int i = 0; i < end; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
    
}
