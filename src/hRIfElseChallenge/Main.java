package hRIfElseChallenge;

import java.util.Scanner;

public class Main {
  
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("Enter an Integer between 1 and 100");
    int numb = scanner.nextInt();
    
    if (numb % 2 != 0) {
      System.out.println("Weird");
      
    } else if (numb == 2 || numb == 4) {
      System.out.println("Not Weird");
      
    } else if (numb >= 6 && numb <= 20) {
      System.out.println("Weird");
      
    } else {
      System.out.println("Not Weird");
    }
  }
}
