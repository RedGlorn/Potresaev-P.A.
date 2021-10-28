#-- coding: utf-8 --
s = 'Строка с  содержащая'
def str(s):
    if s.count('f') == 1:
        print(-1)
    elif s.count('f') < 1:
        print(-2)
    else:
        print(s.find('f', s.find('f') + 1))
str(s)