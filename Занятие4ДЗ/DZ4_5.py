#-- coding: utf-8 --
ctrok = 'Строка f содержащая f'
def str(ctrok):
	if ctrok.count('f') == 1:
		print(ctrok.find('f'))
	elif ctrok.count('f') >= 2:
		print(ctrok.find('f'), ctrok.rfind('f'))

str(ctrok)