# -- coding: utf-8 --
def minim(a,b,c):
    min=a
    if b<=a:
        min=b
    if c<=min:
        min=c
    print("Наименьшее число: ",min)    


print("Три числа:")
a=int(input())
b=int(input())
c=int(input())

minim(a,b,c)