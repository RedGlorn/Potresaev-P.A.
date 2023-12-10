#-- coding: utf-8 --
print('Введите числа x,y')
x = int(input())
y = int(input())
i = 0
probeg=0
while probeg < y:
	x *= 1.1
	i += 1
	probeg += x
print(i)