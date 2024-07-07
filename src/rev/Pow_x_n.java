package rev;

public class Pow_x_n {
    static double myPow(double x , int n,int i){
         if (i == n){
             if(n<0){
                 i = -1*i;
                 x = (double) 1/ x * i;
             } else {
                 x =x*i;
             }
             return x;
         }
         if(n<0){
             if(i<0){
                 i = -1*i;
             }
             x = (double) 1/ x * i;
          return  myPow(x,n,-1-i);
         }
         return myPow(x* i,n,i=i+1);
    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        double r = Double.parseDouble(String.format("%.5f",Math.pow(x,n)));
        System.out.println(r);
        System.out.printf("%.5f\n",Math.pow(x,n));
        double i = (double)1 / 4;
        System.out.println( i);
        System.out.println(-1-1);
        System.out.println(myPow(x,n,1));
    }
}
