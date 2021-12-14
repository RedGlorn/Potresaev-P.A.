#-- coding: utf-8 --
ctrok = 'строка h с  h буквой h'
def str(ctrok):	
    ctrok = ctrok[:ctrok.find('h')] + ctrok[ctrok.rfind('h') + 1:]
    print(ctrok)
str(ctrok)