n=int(input())
arr=[]
for i in range(n):
    i=int(input())
    arr.append(i)
for i in range(n-1):
    min=i
    for j in range(i+1,n):
        if arr[j]<arr[min]:
            min=j
    temp = arr[i]
    arr[i] = arr[min]
    arr[min] = temp
for i in arr:
    print(i,end=" ")