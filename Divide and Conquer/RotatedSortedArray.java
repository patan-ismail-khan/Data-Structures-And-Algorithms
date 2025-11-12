public class RotatedSortedArray {
    public static int search(int arr[],int key,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid = (si+ei)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]>=key){
            if(arr[si]<=key&&arr[mid]>=key){
                return search(arr,key,si,mid-1);
            }
            else{
                return search(arr,key,mid+1,ei);

            }
        }
        else{
            if(arr[ei]>=key&&key>=arr[mid]){
                return search(arr,key,mid+1,ei);
            }
            else{
                return search(arr,key,si,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,8,10,12,14,1,2,3,5};
        int si=0,ei=arr.length-1;
        int key = 0;
        int idx = search(arr,key,si,ei);
        System.out.println(idx);
    }
}
