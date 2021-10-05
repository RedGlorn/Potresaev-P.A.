# -- coding: utf-8 --
def choc(n,m,k):
    if (k < n * m) and ((k % n == 0) or (k % m == 0)):
        print('YES')
    else:
        print('NO')

n = int(input())
m = int(input())
k = int(input())

choc(n,m,k)