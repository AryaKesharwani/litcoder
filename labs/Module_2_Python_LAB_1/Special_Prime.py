
def checkSpecialPrime(sieve, num):
	# While number is not equal to zero
	while (num) :
		
		# If the number is not prime
		# return false.
		if (not sieve[num]) :
			return False

		# Else remove the last digit
		# by dividing the number by 10.
		num //= 10

	# If the number has become zero
	# then the number is special prime,
	# hence return true
	return True

# Function to find the Largest Special 
# Prime which is less than or equal to 
# a given number
def findSpecialPrime(N):

	# Initially all numbers are
	# considered Primes.
	sieve = [True] * (N + 10)
	sieve[0] = sieve[1] = False;
	for i in range(2, N + 1) :
		if (sieve[i]) :

			for j in range(i * i, N + 1, i) :
				sieve[j] = False

	# There is always an answer possible
	while (True) :
		
		# Checking if the number is 
		# a special prime or not
		if (checkSpecialPrime(sieve, N)):
			
			# If yes print the number
			# and break the loop.
			print( N) 
			break
			
		# Else decrement the number.
		else:
			N -= 1

# Driver code
if __name__ == "__main__":
	findSpecialPrime(int(input()))
# 	findSpecialPrime(100)
