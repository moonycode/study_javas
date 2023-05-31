import java.sql.Array;

public class Arrays {
  public String[] initialArrays(){
    String[] carsTypes = {"Volvo", "BMW", "Ford", "Mazda", "KIA"};
    return carsTypes ;
  }

  public static void main(String[] args) {
    Arrays arrays = new Arrays(); // 인스턴스화 // 내부에서 변수를 할당해서 사용
    String[] cars = arrays.initialArrays(); // cars = {"Volvo", "BMW", "Ford", "Mazda", "KIA"}
    System.out.println(cars.length); // 5
    for (int first=0; first<cars.length; first = first+1){ // Arrays 내용 출력
      System.out.print(cars[first]+",");
    }
    
      System.out.println();
    // return 0;
  }
}