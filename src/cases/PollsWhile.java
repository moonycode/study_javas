package cases;
import java.util.Scanner;

public class PollsWhile {
  // 선택에 따라 안내글을 보여드립니다.
  public static void main(String[] args) {

    //Try Catch문 사용  
    try {
      // 변수 선언
      Scanner sc = new Scanner(System.in);
      boolean loops = true ;
      String userStr;

    // loops가 true일 때 반복 안내
      while (loops) {
        System.out.println("------ 작동 key ------");        
        System.out.println("(E)xit: 종료");
        System.out.println("(P)oll: 설문 시작");
        System.out.println("(S)tatistic: 설문 통계");
        System.out.println();
        System.out.print("선택 입력: ");
        userStr = sc.nextLine();
  
       // P or Poll 입력할 경우
        if (userStr.equals("P") || userStr.equals("Poll")) {
          System.out.println("------ 설문 시작 ------");
          System.out.println();

       // S or Statistic 입력할 경우
        } else if (userStr.equals("S") || userStr.equals("Statistic")) {
          System.out.println("------ 설문 통계 ------");
          System.out.println();

       // E or Exit 입력할 경우 break
      } else if (userStr.equals("E") || userStr.equals("Exit")) {
        System.out.println("------ 설문 종료 ------");
        break;

        // 옵션에 없는 단어 입력할 경우       
        } else {
            System.out.println("잘못 입력하셨습니다. 작동 key에 있는 문구를 입력해주세요.(대소문자 구분)");
            System.out.println();
        }
      }


      } catch (Exception e) {
        System.out.println();
      } finally {
        System.out.println();
      }

      System.out.println();

    // return 0;
  }
}
