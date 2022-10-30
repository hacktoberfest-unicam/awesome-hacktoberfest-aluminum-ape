def stalin_sort(arr: list) -> list:
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
    return arr

def init_array() -> list:
    #init array with random values
    #NOTE: this requires numpy library
    """
    import numpy as np
    arr = np.random.randint(1,101,9)
    """

    #init array to user input
    """
    try:
        print("insert any string to stop adding numbers to the list")
        arr = []
        while True:
            arr.append(int(input()))
    except:
        pass
    """
    #init array with fixed values
    arr = [8, 1, 2, 3, 4, 5, 6, 7, 9]
    return arr

from copy import deepcopy
if __name__ == 'main':
    arr = init_array()
    final_arr = stalin_sort(arr)
    print(arr, '->', final_arr)
