#-- coding: utf-8 --
s = 'Строка для перестановки'
def str(s):
	a = s[:s.find(' ')]
	sc = s[s.find(' ') + 1:]
	print(sc + ' ' + a)

str(s)