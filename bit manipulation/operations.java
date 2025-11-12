import java.util.*;
public class operations{
    public static void get_ith_bit(int n,int i){
        int bitmask = (1<<i)&n;
        if(bitmask!=0){
            System.out.println("1");
        }
        else 
            System.out.println("0");

    }
    public static void set_ith_bit(int n , int i){
        int bitmask = (1<<i)|n;
        n=bitmask;
        System.out.println(n);
    }
    public static void clear_ith_bit(int n,int i){
        int bitmask = (~(1<<i))&n;
        n=bitmask;
        System.out.println(n);
    }
    public static void update_ith_bit(int n,int i,int bit){
        if(bit==0){
            clear_ith_bit(n, i);
        }
        else
            set_ith_bit(n, i);
    }
    public static void clear_last_i_bits(int n,int i){
        int bitmask=(-1<<i)&n;
        n=bitmask;
        System.out.println(n);

    }
    public static void clear_in_range_bit(int n,int i,int j){
        int bitmask=(-1<<(j+1))|(~(-1<<i));
        n=bitmask&n;
        System.out.println(n);
    }
    public static void main(String[] args) {
        int ch,i,n;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1-->get ith bit\n2-->set\n3-->clear\n4-->update\n5-->clear last i bits\n6-->clear in range\n0->exit\nenter ch :");
            ch=sc.nextInt();
            switch ( ch) {
                case 1:
                System.out.println("enter no. : ");
                n=sc.nextInt();
                System.out.println("enter the pos : ");
                i=sc.nextInt();
                get_ith_bit(n,i);
                    
                    break;
                case 2:
                System.out.println("enter no. : ");
                n=sc.nextInt();
                System.out.println("enter the pos : ");
                i=sc.nextInt();
                set_ith_bit(n,i);
                break;
                case 3:
                System.out.println("enter no. : ");
                n=sc.nextInt();
                System.out.println("enter the pos : ");
                i=sc.nextInt();
                clear_ith_bit(n,i);
                break;
                case 4:
                System.out.println("enter no. : ");
                n=sc.nextInt();
                System.out.println("enter the pos : ");
                i=sc.nextInt();
                System.out.println("enter the bit : ");
                int bit =sc.nextInt();
                update_ith_bit(n,i,bit);
                break;
                case 5 :
                System.out.println("enter no. : ");
                n=sc.nextInt();
                System.out.println("enter the pos : ");
                i=sc.nextInt();
                clear_last_i_bits(n,i);
                break;
                case 6:
                System.out.println("enter no. : ");
                n=sc.nextInt();
                System.out.println("enter the pos start : ");
                i=sc.nextInt();
                System.out.println("enter the pos end : ");
                int j=sc.nextInt();
                clear_in_range_bit(n,i,j);
                break;
                case 0:
                System.out.println("exited ...");
                return;
            
                default:
                System.out.println("invalid i/p");
                    
            }
        }
        
    }
}