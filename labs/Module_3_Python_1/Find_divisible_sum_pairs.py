
from collections import Counter

n = int(input())

arr = list(map(int, input().split()))

count = Counter()

for num in arr:
    count[num % n] += 1
ans = 0
for i in range(1, (n >> 1) + 1):
    if i == n - i:
        ans += (count[i] * (count[n - i]-1)) >> 1
    else:
        ans += count[i] * count[n - i]
ans += (count[0]*(count[0]-1)) >> 1
print(ans)
