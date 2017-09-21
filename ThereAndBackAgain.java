public class ThereAndBackAgain{
    public static void main(String[]args){
      System.out.println("Here.");
      erebor();//doesnt compile with out parentheses
      System.out.println("Back first time.");
      //erebor();//without this it will only print "There" once. I was right.
      System.out.println("Back second time.");
    }

    public static void erebor(){
        System.out.println("There. ");
    }
}
