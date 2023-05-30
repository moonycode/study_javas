public class MethodsSwitches {

  public String todayStr(int day){
    String str = "";
    try {
      switch (day) {
        case 1:
          str="Monday";
          break;
        case 2:
          str="Tuesday";
          break;
        case 3:
          str="Wednesday";
          break;
        case 4:
          str="Thursday";
          break;
        case 5:
          str="Friday";
          break;
        case 6:
          str="Saturday";
          break;
        case 7:
          str="Sunday";
          break;
      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return str;
  }

  public static void main(String[] args){
    int day = 4; // 1~7 가능
    String str = "";
    try {

      MethodsSwitches mS = new MethodsSwitches();
    
      String returnResult = mS.todayStr(day);
      
      System.out.println(returnResult);
    }


    catch (Exception e) {
        // TODO: handle exception
    }
      // return 0;
    }
}
