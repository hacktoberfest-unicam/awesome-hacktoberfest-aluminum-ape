import os

def replace(carattere):
    files = [f for f in os.listdir('.') if os.path.isfile(f)]
    for f in files:
        if " " in f:
            print("ciao")
            os.rename(f, f.replace(" ", carattere))
    print("Sostituzione effettuata")

carattere = input("Inserisci il carattere da sostituire: ")
replace(carattere)
