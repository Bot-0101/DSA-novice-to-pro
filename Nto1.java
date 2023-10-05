
public class Nto1 {
  public static void main(String[] args) {
    int n = 4;
    nto1(n);
  }

  public static void nto1(int n) {
    if (n == 0) {
      System.out.println();
      return;
    }
    System.out.print(n + " ");
    nto1(--n);
  }
}