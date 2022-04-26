# -- coding: utf-8 --
def fibb(n,k):
    a,b = 1,1
    c=[a,b]
    for i in range(2, n):
        a,b=b, a+b
        c.append(b)
    print(sum(c[k-1:]))  

n=int(input())
k=int(input())
fibb(n,k)