
def main():
    # Read the number of elements (although not necessary for list operations, it aligns with the given input format)
    n = int(input())
    
    # Read the elements as a single input string and convert them to a list of integers
    # print("Enter all the elements separated by spaces:")
    array = list(map(int, input().split()))
    
    # Check if the number of elements matches 'n'
    if len(array) != n:
        # print("The number of elements entered does not match the number specified.")
        return
    
    # Variables to count positives, negatives, and zeros
    positive_count = 0
    negative_count = 0
    zero_count = 0
    
    # Count each type of element
    for num in array:
        if num > 0:
            positive_count += 1
        elif num < 0:
            negative_count += 1
        else:
            zero_count += 1
    
    # Calculate and print the fractions with three decimal places
    print(f"{positive_count / n:.3f}")
    print(f"{negative_count / n:.3f}")
    print(f"{zero_count / n:.3f}")

if __name__ == "__main__":
    main()
                                                                                                                            