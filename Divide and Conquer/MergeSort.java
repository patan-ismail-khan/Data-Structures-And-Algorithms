public class MergeSort {
    public static void merge(int arr[],int si,int ei,int mid){
        int i = si,j=mid+1;
        int temp[]= new int[ei-si+1];
        int k=0;
        while(i<=mid&&j<=ei){
            if(arr[i]>arr[j]){
                temp[k++]=arr[j];
                j++;

            }
            else{
                temp[k++]=arr[i];
                i++;
            }
        }
        while (i<=mid) {
            temp[k++]=arr[i++];
            
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(i=0;i<temp.length;i++){
            arr[si+i]=temp[i];
        }
    }
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = (si+ei)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,ei,mid);

    }
    public static void printarr(int arr[]){
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {6,3,9,5,2,8};
        int si=0,ei=arr.length-1;
        mergesort(arr, si, ei);
        printarr(arr);
        
    }
}
