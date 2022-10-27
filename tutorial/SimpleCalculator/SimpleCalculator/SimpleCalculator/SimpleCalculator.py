import os
import time
os.system("cls")
print("CALCOLATRICE BELLA")

p = 0;
opzione = 0;

while(p == 0):
    print("------------------");
    print("1. Addizione");
    print("2. Moltiplicazione");
    print("3. Sottrazione");
    print("4: Divisione");
    print("------------------");


    opzione = input("Inserisci numero operazone: ")
    os.system("cls")

    match opzione:
        case "1":
            num1 = input("Inserisci numero 1: ")
            num2 = input("Inserisci numero 2: ")
            os.system("cls")
            print(int(num1)+int(num2))
            print("\n\n")
        case "2":
            num1 = input("Inserisci numero 1: ")
            num2 = input("Inserisci numero 2: ")
            os.system("cls")
            print(int(num1)*int(num2))
            print("\n\n")
        case "3":
            num1 = input("Inserisci numero 1: ")
            num2 = input("Inserisci numero 2: ")
            os.system("cls")
            print(int(num1)-int(num2))
            print("\n\n")
        case "4":
            num1 = input("Inserisci numero 1: ")
            num2 = input("Inserisci numero 2: ")
            os.system("cls")
            print(int(num1)/int(num2))
            print("\n\n")
    
    time.sleep(1.5)
    os.system("cls")

