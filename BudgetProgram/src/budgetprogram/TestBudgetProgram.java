
package budgetprogram;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestBudgetProgram {
public static void main(String[] args) {

        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("The current time, in milliseconds is: " + currentTimeMillis);
        Scanner scan = new Scanner(System.in);
        double Salary, Rent, Food, Bills, Travel;
        double totalRent, totalFood, totalBills, totalTravel;
        double Taxes = 0;
        double totalExpenses;
        double salaryPercent, rentPercent, foodPercent, billsPercent, travelPercent, taxPercent;
        
System.out.println("Annual Expenses Chart \n ---------------------");
while (true) {System.out.println("What is your annual salary?");
try { Salary = scan.nextInt();      
      
if (0 < Salary && Salary <= 15000) {
   double taxSalary = Salary;
    Taxes = taxSalary * 0.1;} 
else if (15000 < Salary && Salary <= 75000) 
{  double taxSalary = Salary;
    Taxes = taxSalary * 0.2;} 
else if (75000 < Salary && Salary <= 200000) 
{  double taxSalary = Salary;
    Taxes = taxSalary * 0.25;} 
else if (200000 < Salary) 
{  double taxSalary = Salary;
    Taxes = taxSalary * 0.3;} 
else { System.out.println("INVALID ENTRY");
} break; }

catch (InputMismatchException a) {
System.out.println("Invalid entry. Please enter a valid integer.");
scan.next(); // Consume the catch error to prevent a loop
 } }
    
while (true) { 
System.out.println("What is your monthly rent?");
try { Rent = scan.nextInt(); 
if (Rent < 0) {System.out.println("INVALID ENTRY");} break; } 
catch (InputMismatchException b) { System.out.println("Invalid entry. Please enter a valid integer.");
scan.next(); } }
while (true) { 
System.out.println("What is your monthly food expenses?");
try { Food = scan.nextInt(); 
if (Food < 0) {System.out.println("INVALID ENTRY");} break; }
catch (InputMismatchException c) { System.out.println("Invalid entry. Please enter a valid integer.");
scan.next(); } }
while (true) { 
System.out.println("How much is your other monthly bills?");
try { Bills = scan.nextInt(); if (Bills < 0) {System.out.println("INVALID ENTRY");} break; }
catch (InputMismatchException d) { System.out.println("Invalid entry. Please enter a valid integer.");
scan.next(); } }
        while (true) { System.out.println("How much do you spend on travel & gas every month?");
       try { Travel = scan.nextInt(); if (Travel < 0) {System.out.println("INVALID ENTRY");} break;
} catch (InputMismatchException e) { System.out.println("Invalid entry. Please enter a valid integer.");
scan.next();} }
        
taxPercent = (Taxes / Salary) * 100;
        
 BigDecimal taxesBigDecimal = BigDecimal.valueOf(taxPercent);
 BigDecimal taxesRoundedBigDecimal = taxesBigDecimal.setScale(1, RoundingMode.HALF_UP);
 double taxesRounded = taxesRoundedBigDecimal.doubleValue();
 
 totalRent = Rent * 12;
 totalFood = Food * 12;
 totalBills = Bills * 12;
 totalTravel = Travel * 12;
 
 totalExpenses = totalRent + totalFood + totalBills + totalTravel + Taxes;
 salaryPercent = (totalExpenses / Salary) * 100;
 rentPercent = (Rent * 12 / Salary) * 100;
 foodPercent = (Food * 12 / Salary) * 100;
 billsPercent = (Bills * 12 / Salary) * 100;
 travelPercent = (Travel * 12 / Salary) * 100;
 BigDecimal rentBigDecimal = BigDecimal.valueOf(rentPercent);
 BigDecimal rentRounded = rentBigDecimal.setScale(1,RoundingMode.HALF_UP);
 BigDecimal foodBigDecimal = BigDecimal.valueOf(foodPercent);
 BigDecimal foodRounded = foodBigDecimal.setScale(1,RoundingMode.HALF_UP);
 BigDecimal billsBigDecimal = BigDecimal.valueOf(billsPercent);
 BigDecimal billsRounded = billsBigDecimal.setScale(1,RoundingMode.HALF_UP);
 BigDecimal travelBigDecimal = BigDecimal.valueOf(travelPercent);
 BigDecimal travelRounded = travelBigDecimal.setScale(1,RoundingMode.HALF_UP);
 scan.close();
System.out.println("--------------------------------------------------");
System.out.println(" Salary:" + Salary + "\n Salary expenses percentage:" + salaryPercent + "%\n Total: " + totalExpenses + "\n Rent:" + totalRent + "    | Rent percentage:    " + rentRounded + "%");
System.out.println(" Food:" + totalFood + "     | Food percentage:    " + foodRounded + "%\n Bills:" + totalBills + "    | Bills percentage:   " + billsRounded + "%");
System.out.println(" Travel:" + totalTravel + "   | Travel percentage:  " + travelRounded + "%");
System.out.println(" Taxes:" + Taxes + "   | Total Tax percentage " + taxesRounded + "%");

if (salaryPercent > 300) {
System.out.println("\n It appears you are facing a massive amount of debt, if it is too late to seek a financial advisor- \n you must go to your closest lawyers office & file for bankruptcy.");
} else if (salaryPercent > 100) {
System.out.println("I suggest you contact your closest fincancial advisor immediately!");
} else if (salaryPercent < 50) {
    System.out.println("Your finances are loooking amazing. Keep up the great work!");
    }
else {System.exit(0);} 
    }
    
}
