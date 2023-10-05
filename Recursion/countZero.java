public class countZero{
  public static void main(String [] args){
    System.out.println(count(302100,0));
  }
  public static int count(int n){
    if(n==0){
      return 0;
    }
    if(n%10 == 0 ){
      return 1 + count(n/10);
    }
    return count(n/10);
  }
  public static int count(int n,int c){
    if(n==0){
      return c;
    }
    if(n%10 == 0 ){
      return count(n/10,c+1);
    }
    return count(n/10,c);
  }
}