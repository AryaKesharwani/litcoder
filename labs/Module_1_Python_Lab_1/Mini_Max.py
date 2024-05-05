
from itertools import combinations

def min_max_sum_of_four(numbers):
    # Generate all combinations of 4 out of the 6 numbers
    combos = combinations(numbers, 4)
    
    # Compute the sum for each combination
    sums = [sum(combo) for combo in combos]
    
    # Find the minimum and maximum sum
    min_sum = min(sums)
    max_sum = max(sums)
    
    # Return the result as required (min and max on the same line)
    return f"{min_sum} {max_sum}"

# Test cases from the problem description
test1= list(map(int, input().split()))
# test1 = [1, 3, 4, 2, 5, 6]
# test2 = [12, 3, 4, 8, 1, 5]

# Output for test cases
output1 = min_max_sum_of_four(test1)
print(output1)
