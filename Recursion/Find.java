import java.util.*;

public class Find{
  public static void main(String [] args){
    // int [] arr = {3,4,1,9,0,4};
    // int t= 0;
    // System.out.println(find(arr,t));
    // int [] arr = {3,4,1,9,0,0,4};
    // int t= 0;
    // System.out.println(find1(arr,t));
    int [] arr = {3,4,1,9,0,0,3,8,0,4};
    int t= 0;
    // ArrayList<Integer> l = new ArrayList<>();
    // System.out.println(findAll(arr,t,l));
    // System.out.println(findAllWithoutArray(arr,t));
    System.out.println(findAllWith(arr,t));
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
  public static ArrayList<Integer> findAll(int[] arr,int t ,ArrayList<Integer> l){
    return searchAll(arr,t,0,l);
  }
  private static ArrayList<Integer> searchAll(int[] arr,int t , int i,ArrayList<Integer> l){
    if(i==arr.length){
      return l;
    }
    
    if(arr[i]==t){
      l.add(i);
    }
    return searchAll(arr,t,i+1,l);
    
    
  }

  public static ArrayList<Integer> findAllWithoutArray(int[] arr,int t){
    return searchAll1(arr,t,0);
  }
  private static ArrayList<Integer> searchAll1(int[] arr,int t , int i){
    ArrayList<Integer> l = new ArrayList<>();
    if(i==arr.length){
      return l;
    }
    if(arr[i]==t){
      l.add(i);
    }
    l.addAll(searchAll1(arr,t,i+1));
    return l;
    
  }

  static ArrayList<Integer> l = new ArrayList<>();
  public static ArrayList<Integer> findAllWith(int[] arr,int t ){
    return searchAll2(arr,t,0);
  }
  private static ArrayList<Integer> searchAll2(int[] arr,int t , int i){
    if(i==arr.length){
      return l;
    }
    
    if(arr[i]==t){
      l.add(i);
    }
    return searchAll2(arr,t,i+1);
    
    
  }

}