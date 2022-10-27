import requests
import json

r = requests.get('https://jsonplaceholder.typicode.com/todos/1')
data = json.loads(r.content)

print(data)

for item in data:
    print(item + ": " + str(data[str(item)]))