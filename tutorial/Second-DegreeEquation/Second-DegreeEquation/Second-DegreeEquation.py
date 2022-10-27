import math

a = input("Insert coefficient a: ")
b = input("Insert coefficient b: ")
c = input("Insert known term c: ")

delta = (int(b)*int(b))-4*int(a)*int(c)

if delta == 0:
    print("Result:", (-int(b))/(2*int(a)))
elif delta > 0:
    print("First Result:", round(((-int(b))+math.sqrt(delta))/(2*int(a)), 3))
    print("Second Result:", round(((-int(b))-math.sqrt(delta))/(2*int(a)), 3))
else:
    print("No real solution")