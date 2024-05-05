
def digit_to_char(d):
    # Mapping odd digits to their respective characters
    mapping = {1: 'a', 3: 'c', 5: 'e', 7: 'g', 9: 'i'}
    return mapping.get(d, str(d))

def single_digit_sum(n):
    # Summing the digits of a number until a single digit is obtained
    while n >= 10:
        n = sum(int(digit) for digit in str(n))
    return n

def generate_pin(numbers):
    result = []
    for number in numbers:
        # Compute the single digit sum for each number
        single_digit = single_digit_sum(number)
        # Convert the single digit to the corresponding character if it's odd
        result.append(digit_to_char(single_digit))
    return ''.join(result)

def main():
    # Take input from the user
    user_input = input()
    numbers = [int(num) for num in user_input.split()]
    
    # Generate and print the PIN
    pin = generate_pin(numbers)
    print( pin)

# Execute the main function
if __name__ == "__main__":
    main()