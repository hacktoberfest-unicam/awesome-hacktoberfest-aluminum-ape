import os

path = input('Inserisci il path in cui applicare lo script: ')

sep = input('Inserisci il separatore che andra a sostituire gli spazi bianchi: ')

files = os.listdir(path)

for f in files:
    nuovo_nome = f.replace(' ', sep)
    os.rename(os.path.join(path, f), os.path.join(path, nuovo_nome))