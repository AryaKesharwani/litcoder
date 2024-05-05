from collections import Counter
from heapq import heappush, heappop

arr = list(map(int, input().split()))

count = Counter(arr)

heap = []

for c in count:
    heappush(heap,(-count[c], c))

print(heappop(heap)[1])