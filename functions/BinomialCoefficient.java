
public class BinomialCoefficient {
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
    public static float bincoef(int n ,int r){
        float result;
        result = (factorial(n))/(factorial(n-r)*factorial(r));
        return result;
    }
    public static void main(String args[]){
        float result = bincoef(5, 2);
        System.out.println(result);
    }
    
}
