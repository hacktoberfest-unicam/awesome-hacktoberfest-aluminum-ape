import string

if __name__ == '__main__':
    input_string = input()
    counts = {l: 0 for l in list(string.ascii_lowercase) + list(string.ascii_uppercase) + [' '] + ['vowels', 'consonants']}
    for k in list(string.ascii_lowercase) + list(string.ascii_uppercase) + [' ']:
        counts[k] = input_string.count(k)
        if k in ['a', 'e', 'i', 'o', 'u']:
            counts['vowels'] += counts[k]
        elif k != ' ':
            counts['consonants'] += counts[k]
    print(counts)
