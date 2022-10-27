def Convertitore(num):

    if num >= 1:
        Convertitore(num // 2)
    print(num % 2, end='')


if __name__ == '__main__':
    n = input("Inserisci numero da convertire: ")

    # Calling function
    Convertitore(int(n))
