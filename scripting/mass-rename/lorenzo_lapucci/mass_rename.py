import os

replacement = input("Insert the replacement string: ")

path = input("Choose the path")

[os.rename(f, f.replace(' ', replacement)) for f in os.listdir(path)]
