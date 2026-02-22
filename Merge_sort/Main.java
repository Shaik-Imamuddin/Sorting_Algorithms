import java.util.Scanner;

public class Main{

    static void merge(int arr[],int res[],int left,int mid,int right){
        int i=left,j=mid+1,k=left;

        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                res[k]=arr[i];
                k++;i++;
            }
            else{
                res[k]=arr[j];
                k++;j++;
            }
        }

        if(i>mid){
            while(j<=right){
                res[k]=arr[j];
                k++;j++;
            }
        }
        else{
            while(i<=mid){
                res[k]=arr[i];
                k++;i++;
            }
        }

        for(i=left;i<=right;i++){
            arr[i]=res[i];
        }

    }

    static void merge_sort(int arr[],int res[],int left,int right){
        if(left>=right)
            return;
        int mid=(left+right)/2;
        merge_sort(arr,res,left,mid);
        merge_sort(arr,res,mid+1,right);
        merge(arr,res,left,mid,right);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        int res[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        merge_sort(arr,res,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}