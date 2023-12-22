// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Linear seacrh algorithm
      int[] arr = {5,65,6,4,4,3,232,6};
      int target = 232 ;
      int start = 2;
      int end = 5;
      boolean ans = linearSearch(arr, target,start,end);
        System.out.println(ans);
    }
  static boolean linearSearch(int[] arr, int target,int start,int end){
    if(arr.length == 0){
        return false;
      }
    for(int i = start; i<= end;i++){
      int element = arr[i];
      if(element == target){
        return true;
      }
    }
      return false;
  }
  
  ///
  
}