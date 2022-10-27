stringa = input("Inserisci una stringa: ")

vocali = 0
for i in stringa:
    if i in "aeiou":
        vocali += 1

consonanti = 0
for i in stringa:
    if i in "bcdfghjklmnpqrstvwxyz":
        consonanti += 1

spazi = 0
for i in stringa:
    if i in " ":
        spazi += 1        

print("Vocali: ", vocali)
print("Consonanti: ", consonanti)
print("Spazi: ", spazi)
