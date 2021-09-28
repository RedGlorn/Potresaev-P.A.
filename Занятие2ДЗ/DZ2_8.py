# -- coding: utf-8 --
a = int(input())
b = int(input())
c = int(input())
if a==b and b==c:
    print(3)
elif (a==b and b!=c) or (a!=b and b==c) or (c!=b and a==c):
    print(2)
else :
    print(0)
