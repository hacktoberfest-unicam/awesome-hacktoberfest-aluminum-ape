import argparse
import os

parser = argparse.ArgumentParser(description='mass rename tool, rename all files in the current directory')
parser.add_argument('separator', help='separator')
args = parser.parse_args()

files = os.listdir(os.getcwd())
for f in files:
    file_path = os.path.join(os.getcwd(), f)
    if not (os.path.isdir(file_path)):
        new_name = f.replace(" ", args.separator)
        os.rename(f, new_name)