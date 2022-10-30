import csv
#aa

def csvhandler(file_name):
    with open(file_name, 'r') as csvfile:
        reader = csv.reader(csvfile, delimiter=',')
        for row in reader:
            print(row)


def csvhandler_elimina(file_name):
    with open(file_name, 'r') as csvfile:
        reader = csv.reader(csvfile, delimiter=',')
        cont = 0
        # print without header
        for row in reader:
            if cont > 0:
                print(cont, row)
            cont = cont + 1


file_name = input("Inserisci il nome del file: ")
while True:
    menu = """
    Premi 1 per stampare il file csv
    Premi 2 per inserire una nuova riga
    Premi 3 per rimuovere una riga
    """
    scelta = input(menu)
    if scelta == '1':
        csvhandler(file_name)

    elif scelta == '2':
        # print header
        with open(file_name, 'r') as csvfile:
            reader = csv.reader(csvfile, delimiter=',')
            for row in reader:
                header = row
                break
        print(header)

        with open(file_name, 'a',newline='') as csvfile:
            writer = csv.writer(csvfile, delimiter=',')
            new_row = []
            for i in header:
                new_row.append(input("Inserisci il valore per " + i + ": "))
            writer.writerow([])
            writer.writerow(new_row)
            print("Riga inserita correttamente")
        
        with open(file_name, 'r') as f:
            lines = f.readlines()
        with open(file_name, 'w') as f:
            for line in lines:
                if line.strip("\n"):
                    f.write(line)

    elif scelta == '3':
        print('Rimuovi una riga')
        csvhandler_elimina(file_name)
        numero_riga = int(
            input('Inserisci l\'numero della riga da rimuovere: '))
        with open(file_name, 'r') as csvfile:
            reader = csv.reader(csvfile, delimiter=',')
            lines = list(reader)
        with open(file_name, 'w') as csvfile:
            writer = csv.writer(csvfile, delimiter=',')
            for row in lines:
                if lines.index(row) != numero_riga:
                    writer.writerow(row)

    else:
        print('Scelta non valida')