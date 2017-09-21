import java.util.Scanner;

public class BMICalculator{

    public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);
    double feet,inches,height,m,kg,bmi,lbs;

    System.out.print("Your height(feet only): ");
    feet=keyboard.nextDouble();
    System.out.print("Your height(inches): ");
    inches=keyboard.nextDouble();

    height = (feet*12 + inches)*0.025;

    System.out.print("Your weight in lbs: ");
    lbs= keyboard.nextDouble();

    bmi=(lbs*.45)/(height*height);

    System.out.println("Your BMI is " + bmi);

    }
}
