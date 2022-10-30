arr = [8, 1, 2, 3, 4, 5, 6, 7, 9]
curr_elem = arr[0]
arr_size = len(arr)
i = 1
while i<arr_size:
    print(i, arr[i], arr)
    if arr[i] < curr_elem:
        del arr[i]
        arr_size = len(arr)
        i-=1
    else:
        curr_elem = arr[i]
    i+=1
print(arr)
