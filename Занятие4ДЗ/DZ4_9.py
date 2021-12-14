#-- coding: utf-8 --
ctrok = input('Введите строку ')
simb = input('Введите символ который надо удалить ')

def str(ctrok):
    a = ctrok.replace(simb, '')
    print(a)

str(ctrok)