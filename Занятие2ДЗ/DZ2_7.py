# -- coding: utf-8 --
def year(a):
    if (a%4 == 0 and a%100 != 0) or (a%400 == 0):
        print("Високосный")
    else:
        print("Обычный")

a = int(input())

year(a)