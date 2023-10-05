public class BinarySearchRec{
  public static void main(String []args){
    int [] arr = {1,2,3,4,4,5,7,8};
    int target = 4;
    System.out.println(BSRec(arr,target,0,arr.length-1));
  }
  private static int BSRec(int [] arr,int target,int s ,int e){
    if(s>e){
      return -1;
    }
    int mid = s+(e-s)/2;
    if(arr[mid]==target){
      return mid;
    }
    if(arr[mid]>target){
      return BSRec(arr,target,s,mid-1);
    }
    return BSRec(arr,target,mid+1,e);
  }
} 