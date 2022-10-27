vowels = ['a', 'e', 'i', 'o', 'u']

vowels_count = 0
consonants_count = 0
blanks_count = 0

s = input('Enter your string: ')

for char in s:
    if char in vowels:
        vowels_count += 1
    elif char == " ":
        blanks_count += 1
    else:
        consonants_count += 1

print("String length:",len(s))
print("Vowels:",vowels_count)
print("Consonants:",consonants_count)
print("Blanks:",blanks_count)