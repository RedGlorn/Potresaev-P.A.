#-- coding: utf-8 --

def str():
    print("Введите строку с буквами h")
    ctrok = input()
    tri = ctrok[:ctrok.find('h')]
    dva = ctrok[ctrok.find('h'): ctrok.rfind('h')]
    raz = ctrok[ctrok.rfind('h') + 1:]
    print(tri + dva[::-1] + raz)

str()