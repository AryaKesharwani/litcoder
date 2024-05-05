
def check_sorted_grid(grid):
    # Sort each row in the grid
    sorted_rows = [''.join(sorted(row)) for row in grid]
    
    # Transpose the grid to check columns
    transposed = [''.join(row[i] for row in sorted_rows) for i in range(len(sorted_rows[0]))]
    
    # Check if all transposed rows (original columns) are sorted
    for column in transposed:
        if column != ''.join(sorted(column)):
            return "NO"
    
    return "YES"



def parse_and_check_grid(input_string):
    # Split the input string by commas to extract different parts
    parts = input_string.split(',')

    # The grid dimensions and data are the second part onwards
    # Extract the grid data
    grid_data = parts[1:]  # Since the first part is "1,3 3" and is not needed for actual grid content

    # Extract grid dimensions (assume structure is 'number,number')
    # Extract grid rows (last parts after the dimensions)
    grid_rows = [part for part in grid_data if len(part) == len(grid_data[0])]  # Assume all rows are of same length

    # Check if the grid is sorted both in rows and columns
    return check_sorted_grid(grid_rows)

# Testing the function on a given input structure
test_input = input()
output = parse_and_check_grid(test_input)


print(output)
