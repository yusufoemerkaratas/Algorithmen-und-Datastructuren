package Lektion1;

public class FIbonacci {
    public static void main(String[] args){
        System.out.println(fib(6));
        System.out.println(dynamicFibonacci(6));
    }
    public static int fib(int n){
        if(n==0 || n==1) return n;
        else return fib(n-1)+ fib(n-2);
    }
    public static int dynamicFibonacci(int n){
        if(n ==0|| n==1) return n;
        int neu[] = new int[n+1];
        neu[0]=0;
        neu[1]=1;
        for(int i =2;i<=n;i++){
            neu[i]=neu[i-1]+neu[i-2];
        }
        return neu[n];
    }
}
