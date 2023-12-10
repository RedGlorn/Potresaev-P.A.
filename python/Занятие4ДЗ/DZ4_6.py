#-- coding: utf-8 --

def str():
    print("Введите строку с буквами f")
    ctrok = input()
    if ctrok.count('f') == 1:
        print(-1)
    elif ctrok.count('f') < 1:
        print(-2)
    else:
        print(ctrok.find('f', ctrok.find('f') + 1))
str()