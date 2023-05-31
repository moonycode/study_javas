public class GitConflictsCopy {
  public static void main(String[] args) {
    try {
<<<<<<< HEAD
      int first = 2;
      first = first +1;
=======
      int second = 1;
      int first = 0;
      second = first + 1;
>>>>>>> faf4f26b4e5f72425e20c4819e44dee7949fa1ce
    
    } catch (Exception e) {
      // TODO: handle exception
    }
    // return 0;
}
}