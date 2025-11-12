import java.util.*;
public class countSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no . : ");
        int n = sc.nextInt();
        int count =0;
        while ((n>0)) {
            int lsb = n%2;
            n=n>>1;
            if(lsb==1){
                count++;
            }
            
        }
        System.out.println(count);
    }
    
}
