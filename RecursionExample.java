public class RecursionExample{
   public static void main(String... args){
      RecursionExample recursion = new RecursionExample();
      System.out.println(recursion.doFactorial(5));
   }
   public int doFactorial(int n){
      if(n==1) return 1;
      return n * doFactorial(n-1);
   }
   public int doSum(int n){
     if (n==1) return (n*n+n)/2;
     return n * doSum()
   }
   public int sumRange(int f, t){
     return doSum(to)-doSum(from);
   }
   do multiRange(from, to, from, to){
     return doRange(from,to);
            doRange(from,to);
   }
   doFactorialMultiRange(#){
     return doFactorial(doMultiRange)
   }
}
