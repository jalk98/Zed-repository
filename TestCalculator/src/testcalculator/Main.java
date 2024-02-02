
package testcalculator;

import java.util.Scanner;


//@author jorda_xxxx434

public class Main {
    public static void main(String[] args) {
   
   int operator, n1, n2;
        
        System.out.println(" 1 - Add \n 2 Subtract \n 3 - Multiply \n 4 - Divide");
        System.out.println("Choose Operator");
        Scanner scan = new Scanner(System.in);
      operator = scan.nextInt();
      System.out.print("Enter first number : ");
      n1 = scan.nextInt();
      System.out.print("Enter second number : ");
      n2 = scan.nextInt();
      
      int result = 0;
      switch(operator) {
          case 1:
                 result = n1 + n2;
                 break;
      
                 
          case 2:
          result = n1 - n2;
          break;
          
          case 3: 
          result = n1 * n2;
          break;
          
          case 4: 
          result = n1 / n2;
          break;
          default:
          System.out.println("Entered operator is not valid");
          }
      System.out.println("The result is " + result);
    }
    
}
