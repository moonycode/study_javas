import java.util.Scanner;

public class methodsIfs {

  public String whatTime(int time) {
    String str = "";
    try {
    if (time < 12) {
      str ="오전입니다.";
    } else if (time < 18) {
      str="오후입니다.";
    } else {
      str="밤입니다.";
    }
  }
  catch (Exception e) {
    // TODO: handle exception
  }

  return str;

}

  public static void main(String[] args) {

    try {
      Scanner sc = new Scanner(System.in);
      boolean p = true;
      methodsIfs mI = new methodsIfs();

      while (p) {
        System.out.print("현재 시각: ");
        int time = sc.nextInt();
        String timeStr = mI.whatTime(time);
        System.out.println(timeStr);        
        if (time == 0) {
          System.out.print("--- 종료합니다. ---");
          p = false;
        }
      }
      
    } catch (Exception e) {
      // TODO: handle exception
    }
    // return 0;//
  }
}
