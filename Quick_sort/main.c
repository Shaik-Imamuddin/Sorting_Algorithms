#include <stdio.h>

int partition(int arr[],int left,int right,int pivot){
    while (left<=right){

        while (arr[left]<pivot){
            left++;
        }

        while (arr[right]>pivot){
            right--;
        }

        if (left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    return left;   
}

void quick_sort(int arr[],int left,int right){
    if (left>=right)
        return;
    int mid=(left+right)/2;
    int pivot=arr[mid];
    int index=partition(arr,left,right,pivot);
    quick_sort(arr,left,index-1);
    quick_sort(arr,index,right);
}

int main(){
    int n;
    scanf("%d",&n);
    int arr[n];

    for(int i=0;i<n;i++) {
        scanf("%d",&arr[i]);
    }

    quick_sort(arr,0,n-1);

    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}