// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Linear seacrh algorithm
      int[] arr = {5,65,6,4,4,3,232,6};
      int target = 232 ;
      boolean ans = linearSearch(arr, target);
        System.out.println(ans);
    }
  static boolean linearSearch(int[] arr, int target){
    if(arr.length == 0){
        return false;
      }
    for(int i = 0; i<= arr.length;i++){
      int element = arr[i];
      if(element == target){
        return true;
      }
    }
      return false;
  }
  
  ///
  
}