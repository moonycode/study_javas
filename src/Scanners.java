import java.util.Scanner;

public class Scanners{

  public static void main(String[] args) throws InterruptedException{
    Scanner myObj = new Scanner(System.in);
    boolean t = true;
    String letter = null;
    int count = 0;
    while (t) {
      System.out.println("Enter keyword");
      letter = myObj.nextLine();
      switch(letter) {
        case "P":
          System.out.println("letter P");
          break;
      }
    }
  }
}