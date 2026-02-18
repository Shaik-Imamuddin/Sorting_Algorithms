n=int(input())
arr=[]
for i in range(n):
    i=int(input())
    arr.append(i)

for i in range(n):
    key = arr[i]
    j = i - 1
    while j >= 0 and arr[j] > key:
        arr[j + 1] = arr[j]
        j -= 1
    arr[j + 1] = key
    
for i in arr:
    print(i,end=" ")