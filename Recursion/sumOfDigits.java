public class sumOfDigits{
  public static void main(String args[]){
    int n = 1111;
    System.out.println(sumofD(n));
    System.out.println(prodofD(n));
  }
  public static int sumofD(int n){
    if(n==0) return 0;
    return n%10 + sumofD(n/10);
  }
  public static int prodofD(int n){
    if(n==0) return 1;
    return n%10 * prodofD(n/10);
  }
}