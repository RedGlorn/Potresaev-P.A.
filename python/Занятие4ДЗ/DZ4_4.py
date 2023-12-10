#-- coding: utf-8 --
def str():
	print("введите строку")
	ctrok = input()
	a = ctrok[:ctrok.find(' ')]
	ctr = ctrok[ctrok.find(' ') + 1:]
	print(ctr + ' ' + a)

str()