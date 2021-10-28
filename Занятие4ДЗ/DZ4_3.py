#-- coding: utf-8 --
s = 'Строка для деления'
def str(s):
	a = (s[len(s) // 2:] + s[:len(s) // 2])
	print(a)

str(s)