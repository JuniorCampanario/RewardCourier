package unit3practice5;

import java.util.Scanner;

public class Unit3Practice5 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        Scanner scan = new Scanner (System.in);
        
        for (i = 0; i == 0; i++){
    
            System.out.print("Enter with next number for sum: ");
            sum = scan.nextInt() + sum;
            if (scan.nextInt() == 0){
                i = 0;
            }
       
        }
    }
    
}
