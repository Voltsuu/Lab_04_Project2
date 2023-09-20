import java.util.Scanner;

public class salesTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variable declaration
        double salesTax = 0.05;
        int cost;


        System.out.println("What is your starting cost?");
        cost = scan.nextInt();
        double salesTaxCost = salesTax * cost;
        double total = cost + salesTaxCost;
        System.out.println("Your sales tax is $" + salesTaxCost);
        System.out.println("Your total with sales tax is " + total);

    }

}