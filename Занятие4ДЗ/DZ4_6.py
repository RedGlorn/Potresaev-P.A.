#-- coding: utf-8 --
ctrok = 'Строка с  содержащая'
def str(ctrok):
    if ctrok.count('f') == 1:
        print(-1)
    elif ctrok.count('f') < 1:
        print(-2)
    else:
        print(ctrok.find('f', ctrok.find('f') + 1))
str(ctrok)