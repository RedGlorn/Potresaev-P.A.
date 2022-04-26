#-- coding: utf-8 --
print('Введите последовательность чисел')
sum = 0
dl = 0
n = int(input())
while n != 0:
    sum += n
    dl += 1
    n = int(input())
print('Среднее значение = ',sum / dl)