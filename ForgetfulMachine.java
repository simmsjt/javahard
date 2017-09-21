import java.util.Scanner;

public class ForgetfulMachine{
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What city is the capital of France");
        keyboard.next();

        System.out.println("What is 6 multiplied by 7?");
        keyboard.nextInt();
        //THE 2ND QUESTION BLOWS UP WHEN I TYPE 1.1

        System.out.println("Enter a number between 0.0 and 1.0.");
        keyboard.nextDouble();
        //the 3rd question blows up when i type abc because it is a String not
        // a double variable type
        System.out.println("Is there anything else you would like to say?");
        keyboard.next();
    }
}
