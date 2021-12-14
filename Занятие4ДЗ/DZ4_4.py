#-- coding: utf-8 --
ctrok = 'Строка для перестановки'
def str(ctrok):
	a = ctrok[:ctrok.find(' ')]
	ctr = ctrok[ctrok.find(' ') + 1:]
	print(ctr + ' ' + a)

str(ctrok)