public class factorial {
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact =1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        int x = factorial(10);
        System.out.println(x);
    }
    
}
