
def maxValue(n, queries):
    arr = [0] * (n + 1)  # Initialize an array of size n+1 with zeros
    max_val = 0

    for q in queries:
        a, b, val = q
        for i in range(a, b + 1):
            arr[i] += val
            max_val = max(max_val, arr[i])

    return max_val

# Take input from the user
n = int(input(""))
q = int(input(""))
queries = []

for _ in range(q):
    a, b, val = map(int, input().split())
    queries.append([a, b, val])

print( maxValue(n, queries))
