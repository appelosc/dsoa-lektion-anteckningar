public class Recursy {
    static int ops = 0;

    static int[] fibCache = new int[1000];
    static int fastFib(int n){
        ops++;
        if(n<=1) return n;
        if(fibCache[n] != 0) return fibCache[n];
        int ret = fastFib(n-1) + fastFib(n-2);
        fibCache[n] = ret;
        return ret;
    }

    static void countDown(int n){
        if(n<0) return ;
        System.out.print(n + " ");
        countDown(n-1);
    }
    static int pow(int n, int potens){
        if(potens<=1) return n;
        int ret = n * pow(n, potens-1);
        return ret;
    }

}
