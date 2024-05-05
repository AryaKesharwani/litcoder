
from heapq import heapify, heappush, heappop

def candies_sweetness_target():
    try:
        target_sweetness = int(input())
        candies = list(map(int, input().split()))
    except ValueError:
        print("Invalid input")
        return

    heapify(candies)  # Convert the list to a min-heap
    steps = 0

    while len(candies) > 1:
        # Combine the two least sweet candies
        least_sweet = heappop(candies)
        second_least_sweet = heappop(candies)
        new_sweetness = least_sweet + 2 * second_least_sweet
        heappush(candies, new_sweetness)
        steps += 1

        # Check if the new candy's sweetness exceeds the target
        if candies[0] >= target_sweetness:
            break

    print(f"{steps}")

candies_sweetness_target()