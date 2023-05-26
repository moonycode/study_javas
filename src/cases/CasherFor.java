package cases;

import java.util.Scanner;

public class CasherFor {
  public static void main(String[] args) {
    try {
      // Scanner 호출
      Scanner sc = new Scanner(System.in);

      // 장바구니엔 5가지만 담을 수 있다.
      // 변수 선언
      boolean loops = true;
      int Cnt = 0;
      String s_price;
      int i_price;
      int[] bucket = new int[5];
      int sumPrice = 0;

      // 상단 설명글 출력
      System.out.println("장바구니에는 5개를 넣을 수 있습니다.");
      System.out.println("--- 계산 시작 ---");

      while (loops) {

        if (Cnt > 3) {
          loops = false;
        }

        System.out.print((Cnt + 1) + " 번째 가격: ");
        s_price = sc.nextLine();
        i_price = Integer.valueOf(s_price); // 입력한 가격을 정수로 형변환

        // 가격이 0초과 100이하 일 때 Array에 추가
        if (i_price>0 && i_price <= 100) {
          bucket[Cnt] = i_price;
          Cnt = Cnt + 1;
        }

        // 가격이 100초과 일 때 0원 적용
        else if (i_price > 100) {
          System.out.println("100 초과 0원 적용");
          bucket[Cnt] = 0;
          Cnt = Cnt + 1;
        }

        // 가격이 0 일 때 break
        else if (i_price == 0) {
          bucket[Cnt] = 0;
          loops = false;
        }

        // 잘못 입력 시 안내문구 출력 후 다시 입력
        else {
          System.out.println("잘못 입력하셨습니다. 0이상의 숫자를 입력해 주세요.");
        }

      }

      // Array 내의 가격의 총합 구하기
      for (int num = 0; num < bucket.length; num = num + 1) {
        sumPrice = sumPrice + bucket[num];
      }
      // 총합 출력
      System.out.println();
      System.out.println("--- 담은 총합 ---");
      System.out.print("합계: " + sumPrice);
      System.out.println();
      System.out.println("--- 계산 종료 ---");

    } catch (Exception e) {
      System.out.println("에러발생! 숫자를 입력해 주세요.");      
        // TODO: handle exception
    } finally {

    }
    System.out.println();
    // return 0;

  }
}