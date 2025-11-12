import java.util.*;
public class TrappingRainwater {
    public static void main(String[] args){
        int arr[]={4,2,0,6,3,2,5};
        int n = arr.length;
        int LMaxBoundary[] =new int[n];
        int RMaxBoundary[] = new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
            LMaxBoundary[i]=max;
        }
        max=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
            }
            RMaxBoundary[i]=max;
        }
        int waterLevel,width=1,barheight,TrappedWater=0;
        for(int i=0;i<n;i++){
            waterLevel=Math.min(LMaxBoundary[i],RMaxBoundary[i]);
            barheight=arr[i];
            TrappedWater+=(waterLevel-barheight)*width;



        }
        System.out.println("Trapped water volume : "+TrappedWater);
        
        
    } 
    
}
