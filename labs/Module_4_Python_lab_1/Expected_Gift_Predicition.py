def allocate_gifts(scores):
    n = len(scores)
    if n == 0:
        return "Invalid input"

    # Basic gift allocations based on score comparison to previous member
    gifts = [1] * n

    # First pass: assign minimum gifts required before applying special rules
    for i in range(1, n):
        if scores[i] > scores[i - 1]:
            gifts[i] = gifts[i - 1] + 1

    # Circular check (last vs first)
    if scores[0] > scores[-1]:
        gifts[0] = max(gifts[0], gifts[-1] + 1)
    elif scores[0] == scores[-1]:
        return "Should not receive the same number of gifts"

    # Second pass: apply special rules and check for adjacent equality
    max_gifts = max(gifts)
    for i in range(n):
        if scores[i] % 3 == 0:
            gifts[i] += 3
        if scores[i] % 5 == 0:
            gifts[i] += 5
        if scores[i] % 7 == 0:
            gifts[i] = max_gifts + 1  # ensure highest gifts for divisible by 7
            max_gifts = gifts[i]  # update max gifts for further checks

    # Final check for adjacent members having the same number of gifts
    for i in range(n):
        next_index = (i + 1) % n
        if gifts[i] == gifts[next_index]:
            return "Should not receive the same number of gifts"

    return gifts

# Example usage
input_scores = [int(x) for x in input().split()]
try:
    print(allocate_gifts(input_scores))
except ValueError:
    print("Invalid input")