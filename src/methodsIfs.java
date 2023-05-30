import java.util.Scanner;

public class methodsIfs {

  public String todayStr(int day){
    String str = "";
    int time = 0;
    try {
      Scanner sc = new Scanner(System.in);
      time = sc.nextInt();
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

  return

}


  public static void main(String[] args) {
    try {
      
    } catch (Exception e) {
      // TODO: handle exception
    }
    // return 0;//
  }
}
