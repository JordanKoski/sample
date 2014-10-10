import java.util.Scanner;

public class Hello {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Hello");
    System.out.println("What is your favorite colour");
    String colour = scnr.next();
    System.out.println(colour + " is my favourite colour too!");
    System.out.println(" ");
    System.out.println("What pet do you have?");
    String pet = scnr.next();
    System.out.println("I have a " + pet + " too!");
    

   
    }
}
