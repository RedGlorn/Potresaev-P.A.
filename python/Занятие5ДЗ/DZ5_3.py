#-- coding: utf-8 --
print('Введите натуральное число N')
N = int(input())
d = 2
step = 1
while d <= N:
    step +=1
    d *= 2
print('Показатель степени = ',step - 1,' Число = ', d // 2)