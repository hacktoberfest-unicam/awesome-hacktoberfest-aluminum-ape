"""You have a backpack that can hold n kg, small A kg blocks and large B kg blocks. It is necessary to find the exact number of small and large blocks in order to obtain exactly n kg. Return an array (of length 2) of integers. # {number of small blocks, number of large blocks}."""

# This solution does not assume integer values of n, A or B. 
# Returns 'none' if no solution is found.
def backpack(n, A, B):

    # If either A or B is a factor of n, we can return them directly
    if n % A == 0:
        return [int(n // A), 0]
    elif n % B == 0:
        return [0, int(n // B)]

    # Trivially impossible if both A and B are larger than n
    elif A > n and B > n:
        return None
    
    # If not, we test from 1 to max weight. We skip zero since those cases have been covered.
    else:
        for a in range(1, int(n // A) + 1):
            for b in range(1, int(n // B) + 1):
                total = a * A + b * B
                # Stop looking if max weight is exceeded
                if total > n:
                    break 
                # Return if solution is found
                elif total == n:
                    return [a, b]