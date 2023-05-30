public class MethodBasics {
  // <access_modifier> <return_data_type> <method_name> ( list_of_parameters)
  // {
    // body
  // }
  // x에 +1
  public int F (int x)
  {
    int result = x + 1;
    return result;
  }

  // public int G (int y)
  // {
  //   int result = y + 1;
  //   return result;
  // }


  public static void main(String[] args) {
    try {

            int x = 4; 
            int y = 0; 
            // y = x + 1; // 변수에 +1

            // 컴퓨터가 인지할 수 있는 위치에 있지 않다. 프로그램은 실행이 될 때 하드웨어(RAM)에 실려야 사용된다. = 클래스를 인스턴스화 시킨다. 인스턴스는 클래스다.??? 전체를 가져온다. new -> 클래스 통째로 가져오기 
            MethodBasics methodBasics = new MethodBasics(); // 클래스같지만 function이다. function화(인스턴스화) 시키기.
            y = methodBasics.F(x);
            
            // y = y + 1; // 변수에 +1
            y = methodBasics.F(y);

    } catch (Exception e) {
      // TODO: handle exception
    }
    System.out.println();

    // return 0
  }
}
