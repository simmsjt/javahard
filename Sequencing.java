import java.util.Scanner;

public class Sequencing{
  public static void main(String []args){
    Scanner keyboard = new Scanner(System.in);
    double price,salesTax,total;


    System.out.print("How much is the purchase price?");
    price = keyboard.nextDouble();


    salesTax=price*0.0825;
    total=price + salesTax;

    System.out.println("Iten price:\t" + price);
    System.out.println("Sales tax:\t" + salesTax);
    System.out.println("Total cost:\t"+total);
    //no longer gives error not supprised;
  }
}
