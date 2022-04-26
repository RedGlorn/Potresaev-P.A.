#-- coding: utf-8 --
def str():
	print("введите строку с буквами f")
	ctrok = input()
	if ctrok.count('f') == 1:
		print(ctrok.find('f'))
	elif ctrok.count('f') >= 2:
		print(ctrok.find('f'), ctrok.rfind('f'))

str()