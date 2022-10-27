 # okaaay let's go

print("hi it's me again please enter a thing:")
inp = input()
flag = True
for n in range(len(inp)):
    if inp[n] != inp[-(n+1)]:  # am I your worst nightmare yet?
        flag = False

print(flag)
