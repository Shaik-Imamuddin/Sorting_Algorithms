#include<stdio.h>

void merge(int arr[],int res[],int left,int mid,int right){

    int i=left,j=mid+1,k=left;
    
    while(i<=mid && j<=right){
        if(arr[i]<=arr[j]){
            res[k]=arr[i];
            i++;k++;
        }
        else{    
            res[k]=arr[j];
            j++;k++;
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

void merge_sort(int arr[],int res[],int left,int right){
    if(left>=right)
        return;
    int mid=(left+right)/2;
    merge_sort(arr,res,left,mid);
    merge_sort(arr,res,mid+1,right);
    merge(arr,res,left,mid,right);
}


int main(){
    int n;
    scanf("%d",&n);

    int arr[n],res[n];
    
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }

    merge_sort(arr,res,0,n-1);

    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }

    return 0;
}