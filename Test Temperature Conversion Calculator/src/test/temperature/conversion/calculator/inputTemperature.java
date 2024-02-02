
package test.temperature.conversion.calculator;
import java.util.Scanner;

//@author jordan
 
public class inputTemperature {
    public static void main(String[] args) {
        
 Scanner scan = new Scanner(System.in);
int operator;
operator = scan.nextInt();
 switch(operator) {
 
     case 1: double fahr;
     fahr = scan.nextDouble();
     break;
     
     case 2: double cels;
     cels = scan.nextDouble();
     break;
     
    case 3: double kelv;
     kelv = scan.nextDouble();  
     break;
     
     case 4: double rank;
     rank = scan.nextDouble();
     break;
     
     case 5: double deli;
     deli = scan.nextDouble();
     break;
     
     case 6: double newt;
     newt = scan.nextDouble();
     break;
     
     default: System.out.println("Invalid Numerator");
     }
    }


    
}
