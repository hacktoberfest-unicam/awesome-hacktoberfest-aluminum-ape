import os

separator = input("Insert the separator")

path = input("Insert the path")

files = os.listdir(path)

for index, file in enumerate(files):
    os.rename(os.path.join(path, file), os.path.join(path, file).replace(" ", separator)) 