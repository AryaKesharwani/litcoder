
def canTransform(start, end):
    if len(start) != len(end):
        return False

    n = len(start)
    start_indices = [(i, char) for i, char in enumerate(start) if char != 'X']
    end_indices = [(i, char) for i, char in enumerate(end) if char != 'X']

    if len(start_indices) != len(end_indices):
        return False

    for (i, s_char), (j, e_char) in zip(start_indices, end_indices):
        if s_char != e_char:
            return False
        elif s_char == 'L' and i < j:
            return False
        elif s_char == 'R' and i > j:
            return False

    return True

# Take input from the user
start = input()
end = input()

result = canTransform(start, end)
print(result) 