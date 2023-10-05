public class oneToN {
  public static void main(String[] args) {
    int n = 4;
    oneToN(n);
  }

  public static void oneToN(int n) {
    if (n == 0) {
      System.out.println();
      return;
    }
    oneToN(n-1);
    System.out.print(n + " ");
  }
}