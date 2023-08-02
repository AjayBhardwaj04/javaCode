package Recursion;
public class qun6 {
  
  public static int callPower(int x,int n) {
    if (n==0) {
      return 1;
    }
    if(x==0) {
      return 0;
    }
    int xPownm1 = callPower(x, n-1);
    int xPown = x * xPownm1;
    return xPown;
  }
  public static void main(String[] args) {
    int x= 2, n=5;
    int ans = callPower(x,n);
    System.out.println(ans);
   }
}
