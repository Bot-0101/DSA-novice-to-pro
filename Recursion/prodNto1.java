public class prodNto1{
  public static void main(String [] args){
    int n = 5;
    System.out.println(prod(n));
    System.out.println(summation(n));
  }
  public static int prod(int n){
    if(n==1){
      return 1;
    }
    return n*prod(n-1);
  } 
  public static int summation(int n){
    if(n==1){
      return 1;
    }
    return n+summation(n-1);
  } 
}