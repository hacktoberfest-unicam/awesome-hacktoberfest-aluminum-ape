#   Decimal and Binary
def decimalToBinary(val):
    return "{0:b}".format(int(val))

def binaryToDecimal(val):
    return int(val, 2)

#   Decimal and Hex
def decimalToHex(val):
    return "{0:x}".format(int(val))

def hexToDecimal(val):
    return int(val, 16)

#   Decimal and Octal
def decimalToOctal(val):
    return "{0:o}".format(int(val))

def octalToDecimal(val):
    val = str(val)
    return int(val, 8)

#   Binary and Hex
def binaryToHex(val):
    val = binaryToDecimal(val)
    val = decimalToHex(val)
    return val

def hexToBinary(val):
    val = hexToDecimal(val)
    val = decimalToBinary(val)
    return val

#   Binary and Octal
def binaryToOctal(val):
    val = binaryToDecimal(val)
    val = decimalToOctal(val)
    return val

def octalToBinary(val):
    val = octalToDecimal(val)
    val = decimalToBinary(val)
    return val

#   Hex and Octal
def hexToOctal(val):
    val = hexToDecimal(val)
    val = decimalToOctal(val)
    return val

def octalToHex(val):
    val = octalToDecimal(val)
    val = decimalToHex(val)
    return val

if __name__ == '__main__':
    print("Decimal to Binary: " + str(decimalToBinary(10)))
    print("Binary to Decimal: " + str(binaryToDecimal('1010')))
    print('')

    print("Decimal to Hex: " + str(decimalToHex(22)))
    print("Hex to Decimal: " + str(hexToDecimal('A34')))
    print('')

    print("Decimal to Octal: " + str(decimalToOctal(13)))
    print("Octal to Decimal: " + str(octalToDecimal('10')))
    print('')

    print("Binary to Hex: " + str(binaryToHex('1010')))
    print("Hex to Binary: " + str(hexToBinary('A34')))
    print('')

    print("Binary to Octal: " + str(binaryToOctal('1010')))
    print("Octal to Binary: " + str(octalToBinary(12)))
    print('')
    
    print("Hex to Octal: " + str(hexToOctal('A')))
    print("Octal to Hex: " + str(octalToHex(13)))
    
