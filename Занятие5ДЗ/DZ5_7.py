#-- coding: utf-8 --
print('Введите последовательность чисел')
n = int(input())
x = 0
while n != 0:
    i = int(input())
    if i != 0 and n < i:
        x += 1
    n = i

print('Элементов в последовательности больше предыдущего = ',x)