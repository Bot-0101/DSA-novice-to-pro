public class Find{
  public static void main(String [] args){
    // int [] arr = {3,4,1,9,0,4};
    // int t= 0;
    // System.out.println(find(arr,t));
    // int [] arr = {3,4,1,9,0,0,4};
    // int t= 0;
    // System.out.println(find1(arr,t));
    int [] arr = {3,4,1,9,0,0,4};
    int t= 0;
    System.out.println(findb(arr,t,0));
  }
  public static int find(int[] arr,int t ){
    return search(arr,t,0);
  }
  private static int search(int[] arr,int t , int i){
    if(i==arr.length){
      return -1;
    }
    
    if(arr[i]==t){
      return i;
    }
    return search(arr,t,i+1);
    
    
  }
  public static int find1(int[] arr,int t ){
    return search1(arr,t,arr.length-1);
  }
  private static int search1(int[] arr,int t , int i){
    if(i==-1){
      return -1;
    }
    
    if(arr[i]==t){
      return i;
    }
    return search1(arr,t,i-1);
    
    
  }
  static boolean findb(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        if(arr[index]==target) return true;
        return findb(arr, target, index + 1);
    }

}