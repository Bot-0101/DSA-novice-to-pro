public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8};
        System.out.println(sorted(arr));
    }

    public static boolean sorted(int [] arr){
      return helper(arr,0);
    }
    private static boolean helper(int[] arr,int i){
      if(i==arr.length-1) return true;
      
      if(arr[i+1]<arr[i]){
        return false;
      }
      return helper(arr,i+1);
    }
}