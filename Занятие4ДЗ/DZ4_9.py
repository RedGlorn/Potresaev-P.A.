#-- coding: utf-8 --
s = input('Введите строку ')
sim = input('Введите символ который надо удалить ')

def str(s):
    a = s.replace(sim, '')
    print(a)

str(s)