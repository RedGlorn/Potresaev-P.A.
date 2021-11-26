#-- coding: utf-8 --
print('Введите целое число N')
N = int(input())
i = 2
while N % i != 0:
	i +=1

print('Наименьший натуральный делитель числа ',N,' - ',i)