package elevator;

public class Elevator {

    public static void main(String[] args) {

        int person1 = 140;
        int person2 = 110;
        int person3 = 130;
        int person4 = 110;
        int person5 = 110;
        
        int amount = 8;
        
        int weight = person1 + person2 + person3 + person4 + person5;
        
        System.out.println(weight);
        
        if ((weight <= 600) && (amount <= 8)) {
        
            System.out.println("Good");
            
        }else{
        
            System.out.println("Get out at least one!");
            
        }
    }
    
}
