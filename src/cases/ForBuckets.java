package cases;

import java.util.Scanner;

public class ForBuckets {
  public static void main(String[] args) {
    try {
      // 장바구니엔 3가지만 담을 수 있다.
      String[] bucket = new String[3];
 
      Scanner sc = new Scanner(System.in);
      for (int num = 0; num < bucket.length; num = num + 1) {
        System.out.print((num + 1) + " 번째 담기: ");
        bucket[num] = sc.nextLine();
      }

      System.out.println();
      System.out.println("--- 담은 내용물 ---");
      for (int num = 0; num < bucket.length; num = num + 1) {
        System.out.print(bucket[num]);
        if (num == bucket.length-1) {
          System.out.println();
          break;
        }
        System.out.print(", ");
      }

      System.out.println();
      System.out.println("--- 장보기 종료 ---");

    } catch (Exception e) {
      // TODO: handle exception
    } finally {

    }
    System.out.println();
    // return 0;

  }
}
