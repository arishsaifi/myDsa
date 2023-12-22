public class basicbbinarySearch{
  public static void main(String[] args){
    
    System.out.println("Hello haris");
		int[] arr = {1,2,3,4,5,6,7,8,9,12,13,14,16,34,45,67,89,78,90};
		int target = 45;
		int ans = binarySearch(arr,target);
		System.out.println(ans);

  }
  static binarySearch(int[] arr,int target){
    int start = 0;
    int end = 0;

    while(start <= end){
      int mid = start + (end-start)/2;

      if(target < arr[mid]){
        end = mid-1;
      }
      else if(target > arr[mid]){
        start = mid+1;
      }else{
        return mid;
      }
    }
    return -1;

  }
}