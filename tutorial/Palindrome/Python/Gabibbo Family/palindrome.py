string = Input("Inserire stringa: ")

#Palindrome check
if string == string[::-1]:
    print(True)
else:
    print(False)
