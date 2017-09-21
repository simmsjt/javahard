import java.util.Scanner;

public class RudeQuestions{

    public static void main(String[]args){
        String name;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello. What is your name? ");
        name = keyboard.next();

        System.out.print("Hi, "+name+"! How old are you? ");
        age = keyboard.nextInt();

        System.out.println("So you're "+age+",eh? That's not very old.");
        System.out.println("How much do you weight, "+name+"? ");
        weight = keyboard.nextDouble();

        System.out.println(weight+ "! Better keep that quiet!!");
        System.out.print("Finally, what's your income, "+name+"? ");
        income = keyboard.nextDouble();

        System.out.print("Hopefully that is "+income+" per hour");
        System.out.println(" and not per year!");
        System.out.print("Well, thanks for answering my rude questions, ");
        System.out.println(name + ".");

        //The code still runs with integers when a double is ecpected
        //however I noticed with expetionally large number the printed value is
        //different then the input value. I think this is do to doubles being able
        //to store more than ints but not intirely sure

        //if an numberic value is entered when string epected nothing happens
        //as you can have a string of only numeric characters

        //q1 wont blow up
        //q2 blows up with alpha characters "hello" int cant be string
        //q3 blows up with alpha characters "hello" double cant be string
        //q4 blows up with alpha characters "hello" double cant be string

        String color;
        System.out.println("What's your favorite color?");
        color = keyboard.next();
        System.out.println("Awesome! I love "+color+".");
    }
}
