public class Methods {
  public int add(int first, int second) {
    int result = 0;
    try {
      result = first + second;
    } catch (Exception e) {
      // TODO: handle exception
    }
    return result;
  }

  public int sub(int first, int second) {
    int result = 0;
    try {
      result = first - second;
    } catch (Exception e) {
      // TODO: handle exception
    }
    return result;
  }

  public static void main(String[] args) {
    // - 인스턴스는 1회
    // - 초기 변수 값은 2를 넘지 않는다.
    // - main에서 결과 값은 17

    try {

      Methods methods_instanced = new Methods();

      int result = 0;
      int goal = 17;
  
      for (int x = 2; result <= goal; result = methods_instanced.add(result, x)) {
        System.out.println("add result = " + result);
        }
      System.out.println("add result = " + result);

      for (int y = 1; result >= goal; result = methods_instanced.sub(result, y)) {
        
        System.out.println("sub result = " + result);
      }


    } catch (Exception e) {
      // TODO: handle exception
    }
    // return 0;
  }

}
