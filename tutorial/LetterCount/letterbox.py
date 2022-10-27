import string
print("Welcome to Los Pitones Hermanos please type a sentence or whatever:")

gustavo_string = input()

chars_dict = {}
for i in string.ascii_lowercase:
    chars_dict[i] = 0  # it works guatafac amigo
for j in string.ascii_uppercase:
    chars_dict[j] = 0  # SONO IL CREATORE DI CODICE MALEDETTO DOVETE TEMERMI NON DISPREZZARMI TEMERMI FEAR ME
chars_dict[' '] = 0  # FEAR THE HARDCODER IT'S COMING FOR YOU HE WILL EAT ALL UR GOOD PRACTICES

for k in chars_dict.keys():
    chars_dict[k] = gustavo_string.count(k)

print("Characters count is: " + str(len(gustavo_string)))
print(chars_dict)

