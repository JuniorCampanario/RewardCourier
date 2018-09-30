package bigest;

public class Bigest {

    public static void main(String[] args) {
        int number1 = 224;
        int number2 = 224;
        int number3 = 224;
        
        if ((number1 > number2) && (number1 > number3)){
        
            System.out.println("The number 1 is bigest");
            
        }else{
            
            if ((number2 > number1) && (number2 > number3)){
                
                System.out.println("The number 2 is bigest");
                
            }else{
                    if ((number3 > number1) && (number3 > number2)){
    
                        System.out.println("The number 3 is bigest");
                    }
           }
            
        }
        
    }
    
}


