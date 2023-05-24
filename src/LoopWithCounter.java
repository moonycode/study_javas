public class LoopWithCounter {
  public static void main(String[] args) {
    // while (condition){
    // code block to be executed
    // }
    int repeatcount = 5;
    int number = 1;
    int count = 1;
    while (count <= repeatcount) {
      System.out.println(number);
      count = count + 1;
      number = number + 1;
    }
    System.out.println("End");
    // return 0;
  }
}
