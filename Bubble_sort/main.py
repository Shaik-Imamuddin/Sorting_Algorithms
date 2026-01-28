n=int(input())
arr=[]
for i in range(n):
    i=int(input())
    arr.append(i)

for i in range(n-1):
    for j in range(n-i-1):
        if(arr[j]>arr[j+1]):
            temp = arr[j]
            arr[j]= arr[j+1]
            arr[j+1]=temp
for i in arr:
    print(i,end=" ")