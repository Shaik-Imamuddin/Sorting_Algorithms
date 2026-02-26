def partition(arr,left,right,pivot):
    while left<=right:
        while arr[left]<pivot:
            left+=1
        while arr[right]>pivot:
            right-=1
        
        if left<=right:
            arr[left],arr[right]=arr[right],arr[left]
            left+=1
            right-=1
    return left

def quick_sort(arr,left,right):
    if left>=right:
        return
    mid=(left+right)//2
    pivot = arr[mid]
    index = partition(arr,left,right,pivot)
    quick_sort(arr,left,index-1)
    quick_sort(arr,index,right)
    
n=int(input())

arr=[]

for i in range(n):
    arr.append(int(input()))

quick_sort(arr,0,n-1)

for i in range(n):
    print(arr[i],end=" ")