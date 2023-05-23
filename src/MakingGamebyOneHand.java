public class MakingGamebyOneHand {
  public static void main(String[] args) {
    int numA = 1;
    int numTemp = 0;
    int numC = 2;
    System.out.println(numA);
    System.out.println(numC);
    numTemp = numA;
    numA = numC;
    numC = numTemp;
    System.out.println(numA);
    System.out.println(numC);
    // return 0;
  }
}
