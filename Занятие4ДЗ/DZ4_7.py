#-- coding: utf-8 --

def str():	
    print("Введите строку с буквами h")
    ctrok = input()
    ctrok = ctrok[:ctrok.find('h')] + ctrok[ctrok.rfind('h') + 1:]
    print(ctrok)
    
str()