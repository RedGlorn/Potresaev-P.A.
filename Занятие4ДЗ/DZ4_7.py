#-- coding: utf-8 --
s = 'строка h с  h буквой h'
def str(s):	
    s = s[:s.find('h')] + s[s.rfind('h') + 1:]
    print(s)
str(s)