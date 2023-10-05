public class steps{
  public static void main(String [] args){
    System.out.println(numSteps(123));
  }
  public static int numSteps(int n ){
    if(n==0) return 0;
    if(n%2 == 0) {
        return 1 + numSteps(n/2);
    }else{
      return 1 + numSteps(n-1);
    }
    
  }
}