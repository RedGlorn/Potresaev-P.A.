#-- coding: utf-8 --
ctrok = 'строка h с буквой h между h'	
def str(ctrok):
    tri = ctrok[:ctrok.find('h')]
    dva = ctrok[ctrok.find('h'): ctrok.rfind('h')]
    raz = ctrok[ctrok.rfind('h') + 1:]
    print(tri + dva[::-1] + raz)

str(ctrok)