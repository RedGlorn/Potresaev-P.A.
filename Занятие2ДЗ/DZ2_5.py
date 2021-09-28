# -- coding: utf-8 --
print("Три числа:")
a=int(input())
b=int(input())
c=int(input())
min=a
if b<=a:
    min=b
if c<=min:
    min=c
print("Наименьшее число: ",min)