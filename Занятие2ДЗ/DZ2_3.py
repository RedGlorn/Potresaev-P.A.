# -- coding: utf-8 --
print("Введите n ")
n = int(input())
hr=0
mn=0
hr=n//60
mn=n%60
if hr>23:
	hr=hr%24
if mn>59:
	mn=mn%60
print(hr," Часа")
print(mn," Минут")


