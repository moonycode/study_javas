public class SetAndGetVariable {
  public static void main(String[] args) throws Exception {
    // 변수선언
    int first = 1;
    int second = 3;
    int third = 5;
    int fourth = 7;
    int fifth = 10;
    int sixth = 9;
    int seventh = 200;
    int eighth = 30;
    int ninth = 50;
    // 값 넣기
    int A = first;
    int B = second;
    int C = third;
    int D = fourth;

    // 조건문
    if (B == second) {
      System.out.println("B는 3이 맞습니다.");
      A = fifth;
    } else {
      System.out.println("B는 3이 아닙니다.");
      C = third;
    }
    ;

    if (D != sixth) {
      System.out.println("D는 9가 아닙니다.");
      B = third;
    } else {
      System.out.println("D는 9가 맞습니다.");
      B = seventh;
    }
    ;

    if (A == fifth) {
      System.out.println("A는 10이 맞습니다.");
      C = ninth;
    } else {
      D = eighth;
      System.out.println("A는 10이 아닙니다.");
    }
    ;

    // 결과 출력
    System.out.println("A :" + A);
    System.out.println("B :" + B);
    System.out.println("C :" + C);
    System.out.println("D :" + D);

    // return 0;
  }
}
