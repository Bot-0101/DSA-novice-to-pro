
public class pallindromeNum {
  public static void main(String [] args){
    System.out.println(palNum(1223));
  }
  public static boolean palNum(int n ){
    return n==rev(n);
  }
  public static int rev (int n ){
    return revn(n , (int)(Math.log10(n))+1);
  } 
  public static int revn(int n , int len){
    if(n%10==n){
      return n;
    }
    return n%10*(int)Math.pow(10,len-1) + revn(n/10,len-1);
  }
}