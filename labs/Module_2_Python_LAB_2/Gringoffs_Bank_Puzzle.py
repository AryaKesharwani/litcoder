
def solve_gringotts_puzzle(array):
    # Validate input
    if any(num < 1 for num in array):
        return "Array should only contain positive values"

    # Process the array as described
    while len(array) > 1:
        # Rotate the array: Move the last element to the front
        array.insert(0, array.pop())
        # Remove the last element
        array.pop()

    # Return the last remaining element
    return array[0]

def main():
    try:
        # Read input from the user and convert it into a list of integers
        input_string = input()
        array = list(map(int, input_string.split()))
        
        # Process and output the result
        result = solve_gringotts_puzzle(array)
        print(result)
    except ValueError:
        print("Please enter only integers.")

if __name__ == "__main__":
    main()
