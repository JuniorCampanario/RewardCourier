package aula24.pkg09.pkg18;
import java.util.Scanner;
public class Aula240918 {

    public static void main(String[] args) {

                Scanner scan = new Scanner (System.in);
		int valor[] = new int[5];
		int maior = 0; 
		for(int i = 0; i < valor.length; i++){

                    System.out.print("Enter the " +(i+1)+"º value5: ");
			valor[i] = scan.nextInt();
			if(valor[i] > maior){ 
				maior = valor[i];
			}
		}
		System.out.println("The bigger number is = "+ maior);
    }    
}
