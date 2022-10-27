while True:
    try:
        a = input("Insert a decimal value: ")
        bin_a = bin(int(a))
        print("Result in binary: " + str(bin_a))
    except:
        print("Enter a valid decimal integer.")


