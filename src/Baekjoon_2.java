import java.util.Scanner;

public class Baekjoon_2 {
  public static void main(String[] args) {
    // 참조 : https://www.acmicpc.net/problem/1000
    // 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter A");

    Scanner myObj2 = new Scanner(System.in);
    System.out.println("Enter B");

    int num1 = myObj.nextInt();
    int num2 = myObj2.nextInt();
    System.out.println(num1+"+"+num2+"="+ (num1+num2));




    // return 0;
  }
}
