
package ed3s6p2e1;


public class ED3S6p2e1 {

 public ED3S6p2e1(int a){
     //suma1(a);
     valores(a);
     System.out.println("valor de factorial "+ factorial(5));
 }
  private void suma1(int a){
      if (a>10);
      else suma1 (a+1);
      System.out.println("al suma es "+a);     
  }
  private int valores (int a){
  if (a<5) System.out.println("valor de a "+(a*valores(a+1)));
  return a;
  }
  private int factorial (int a){
      int fac=1;
      if(a==0|| a==1) return 1;
      else if (a>1)   fac= a*factorial(a-1);
      return fac;
  }
  
    public static void main(String[] args) {
        // TODO code application logic here
        new ED3S6p2e1(1);
    }
    
}
