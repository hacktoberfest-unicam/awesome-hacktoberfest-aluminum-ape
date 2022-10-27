def anybasedecimal(number,base):
    # conversion from any other base to decimal and printing message
    temp = int(number,base)
    print ('Here is your number in base 10 from base ' + input_base + '!')
    print (temp)

if __name__ == '__main__':
    try: 
        # i wanted to put the try method so i can change the value error exception
        # to a different message
        # i take the input of number and base
        num = input('Tell me a number: ')
        input_base = input('Tell me a base:')
        base = int(input_base)
        anybasedecimal(num,base)
    except ValueError:
        raise ValueError("This number cannot be converted with the base given!")