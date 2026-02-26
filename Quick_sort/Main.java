import java.util.Scanner;

public class Main{

    static int partition(int arr[],int left,int right,int pivot){
        while(left<=right){
            while(arr[left]<pivot){
                left++;
            }
            while(arr[right]>pivot){
                right--;
            }

            if(left<=right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        return left;
    }   

    static void quick_sort(int arr[],int left,int right){
        if(left>=right)
            return;
        int mid = (left+right)/2;
        int pivot = arr[mid];
        int index=partition(arr,left,right,pivot);
        quick_sort(arr,left,index-1);
        quick_sort(arr,index,right);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }   
        
        quick_sort(arr,0,n-1);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}