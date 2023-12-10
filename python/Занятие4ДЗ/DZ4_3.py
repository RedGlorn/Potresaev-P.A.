#-- coding: utf-8 --

def str():
	print("введите строку")
	ctrok = input()
	a = (ctrok[len(ctrok) // 2:] + ctrok[:len(ctrok) // 2])
	print(a)

str()