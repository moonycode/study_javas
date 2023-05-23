public class Ifs {
  public static void main(String[] args) throws Exception {
    // if (condition) {
    // // block of code to be executed if the condition is true
    // } else{}
    int first = 20;
    int second = 18;
    if (first > second) {
      System.out.println(first);
    }
    // 12시 이전 오전, 18시 이전 오후, 24시 까지 밤.
    int time = 15;
    if (time < 12) {
      System.out.println("오전");
    } else if (time < 18) {
      System.out.println("오후");
    } else {
      System.out.println("밤");
    }

    System.out.println("Hello, World!");
    // return 0;
  }
}
