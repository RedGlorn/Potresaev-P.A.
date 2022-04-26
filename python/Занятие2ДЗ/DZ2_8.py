# -- coding: utf-8 --
def func(a,b,c):
    if a==b and b==c:
        print(3)
    elif (a==b and b!=c) or (a!=b and b==c) or (c!=b and a==c):
        print(2)
    else :
        print(0)

a = int(input())
b = int(input())
c = int(input())

func(a,b,c)