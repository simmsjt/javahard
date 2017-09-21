import java.util.Scanner;

public class BMICategories{

    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        double bmi;

        System.out.print("Enter your height in inches: ");
        double inches = keyboard.nextDouble();
        System.out.print("Enter your weight in pounds: ");
        double lbs = keyboard.nextDouble();
        bmi=(lbs*0.45)/((inches*0.025)*(inches*0.025));

        //System.out.println(bmi);
        System.out.print("BMI category: ");
        if(bmi<15.0){
          System.out.println("very severely underweight");
        }
        else if(bmi<=16.0){
          System.out.println("severely underweight");
        }
        else if (bmi < 18.5){
            System.out.println("underweight");
        }
        if(bmi<25.0){
            System.out.println("normal weight");
        }
        else if(bmi<30.0){
          System.out.println("overweight");
        }
        else if(bmi<35.0){
            System.out.println("moderately obese");
        }
        else if(bmi<40.0){
            System.out.println(" severely obese ");
        }
        else {
            System.out.println("Very severely/\"morbidly\" obese");
        }
    }
}
