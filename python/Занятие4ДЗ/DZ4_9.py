#-- coding: utf-8 --

def str():
    print('Введите строку ')
    ctrok = input()
    print('Введите символ который надо удалить ')
    simb = input()
    a = ctrok.replace(simb, '')
    print(a)

str()