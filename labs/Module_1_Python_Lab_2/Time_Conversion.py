
def convert_to_military_time(time_str):
    # Extract hour, minutes, seconds and the period (AM/PM)
    hour = int(time_str[:2])
    minute = time_str[3:5]
    second = time_str[6:8]
    period = time_str[8:]

    # Convert time based on the period
    if period == "AM":
        if hour == 12:  # Special case for 12 AM
            hour = 0
    else:  # PM case
        if hour != 12:  # Do not change hour if it's 12 PM
            hour += 12

    # Format the hour in two digit format
    military_hour = f"{hour:02}"

    # Return the military time format
    return f"{military_hour}:{minute}:{second}"

# Test cases from the problem description
test1 = str(input())

# Output for test cases
output1 = convert_to_military_time(test1)
print(output1)