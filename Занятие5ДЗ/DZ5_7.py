#-- coding: utf-8 --
print('Введите последовательность чисел')
n = int(input())
x = 0
maxcount=0
while n != 0:
    i = int(input())
    if n < i:
        x += 1
    else:
        if x > maxcount:
            maxcount=x
        x=0
    n = i

print('Элементов в последовательности больше предыдущего = ',maxcount)