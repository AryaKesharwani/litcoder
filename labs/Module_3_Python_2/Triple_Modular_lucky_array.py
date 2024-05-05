
def find_lucky_array(arr, m=9):
    n = len(arr)
    if n < 4:
        print("Invalid Input")
        return

    arr.sort()  # Sort the array in ascending order

    max_modulo = -1  # Initialize max_modulo to -1
    lucky_arr = []
    multiple_lucky_arrays = False

    for i in range(n - 3):
        a, b, c, d = arr[i:i + 4]
        modulo = ((((a * b) % m) ** c) % m) ** c % m
        if modulo > max_modulo:
            max_modulo = modulo
            lucky_arr = [a, b, c, d]
            multiple_lucky_arrays = False
        elif modulo == max_modulo:
            multiple_lucky_arrays = True

    if multiple_lucky_arrays:
        print("There is more than one lucky arrays")
    elif lucky_arr:
        print(*lucky_arr, max_modulo)
    else:
        print("There is no lucky array in the list of subarrays")

# Example usage
find_lucky_array([2, 4, 5, 3, 1]) 