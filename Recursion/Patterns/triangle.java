public class triangle{
  public static void main(String [] args){
    tria(4);
  }
  public static void tri(int n ){
    // Normal traingle inverted - right angled traingle
    help(n,1);
  }
  private static void help(int i,int j){
    if(i==0) return;
    if(j>i){ 
      System.out.println();
      help(i-1,1);
    }else{
      System.out.print(j+" ");
      help(i,j+1);
    }
  }
  public static void tria(int n ){
    // Normal traingle - right angled traingle
    help2(n,1);
  }
  private static void help2(int i,int j){
    if(i==1){ System.out.print(j+" ");return;}
    if(j>i){ 
      help2(i-1,1);
      System.out.println();
    }else{
      help2(i,j+1);
      System.out.print(j+" ");
    }
  }
}