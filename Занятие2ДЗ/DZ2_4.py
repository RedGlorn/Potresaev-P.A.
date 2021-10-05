# -- coding: utf-8 --
print("Введите a,b,l,N, переменные <> нулю")
def len(a,b,l,N):
    len=l*2+b*(N-2)+a*(N-1)
    print("Длина шнурка должна быть = ",len)

a=int(input())
b=int(input())
l=int(input())
N=int(input())

len(a,b,l,N)