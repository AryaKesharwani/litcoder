
def reverse_string_preserving_special_characters(input_string):
    # Extract letters and store non-letter positions with their characters
    letters = [char for char in input_string if char.isalpha()]
    letters.reverse()  # Reverse the list of letters

    # Reconstruct the string with reversed letters in the correct positions
    output_list = list(input_string)  # Convert string to list to modify it
    letter_index = 0  # Start with the first letter in the reversed list

    for i in range(len(output_list)):
        if output_list[i].isalpha():  # If the character is a letter
            output_list[i] = letters[letter_index]  # Replace it with the reversed letter
            letter_index += 1  # Move to the next letter in the reversed list

    return ''.join(output_list)  # Join list back into string

def main():
    # Get user input
    # print("Enter the string to be reversed (punctuation and spaces will be preserved):")
    user_input = input()
    
    # Process and output the reversed string
    result = reverse_string_preserving_special_characters(user_input)
    # print("Reversed string:", result)
    print(result)

if __name__ == "__main__":
    main()