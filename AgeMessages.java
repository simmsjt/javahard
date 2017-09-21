import java.util.Scanner;

public class AgeMessages{


  public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.print("how old are you?");
    age = keyboard.nextInt();

    System.out.println("You are: ");
    if(age<13){
      System.out.println("\ttoo young to create a Facebook account");
    }
    if(age>=13){
      System.out.println("\tYou are old enough to create a Facebook account");
    }
    if(age<16){
      System.out.println("\ttoo young to get a driver's license");
    }
    if(age>=16){
      System.out.println("\tYou are old enough to get a driver's license");
    }
    if(age<18){
      System.out.println("\ttoo young to get a tatto");
    }
    if(age>=18){
      System.out.println("\tyou are old enough to get a tatto");
    }
    if(age<21){
      System.out.println("\ttoo young to drink alcohol");
    }
    if(age>=21){
        System.out.println("\tyou are old enough to drink alcohol");
    }
    if(age<35){
      System.out.println("\ttoo young to run for PResident of the U.S.");
      System.out.println("\t\t(How sad!)");
    }
    if(age>=35){
      System.out.println("\tYou are old enough to run for PResident of the U.S.");
      System.out.println("\t\t(Huge!)");
    }
    if(age>=64){
      System.out.println("You are old enough to retire!");
    }
    if(age<64){
      System.out.println("You are too young to retire!");
    }
  }
}


//if you put an age greater than 35 none of the messages display
//
