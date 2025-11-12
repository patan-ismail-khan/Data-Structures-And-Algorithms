public class FastExponentiation {
    public static void fastexpo(int n,int pow){
        int ans = 1;
        while(pow>0){
            if((pow&1)!=0){
                ans = ans * n;
            }
            n=n*n;

            pow=pow>>1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        fastexpo(5,3);
    }
    
}
