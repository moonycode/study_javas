public class MakingGamebyOneHand {
  public static void main(String[] args) {
    int numA = 1;
    int numTemp = 0;
    int numC = 2;
    System.out.println("numA: "+numA);
    System.out.println("numC: "+numC);
    numTemp = numA;
    numA = numC;
    numC = numTemp;
    System.out.println("numA: "+numA);
    System.out.println("numC: "+numC);
    // return 0;
  }
}
