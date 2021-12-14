#-- coding: utf-8 --
s = 'Строка для деления'
def str(ctrok):
	a = (ctrok[len(ctrok) // 2:] + ctrok[:len(ctrok) // 2])
	print(a)

str(s)