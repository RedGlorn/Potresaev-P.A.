# -- coding: utf-8 --
def fibb(n):
    if n==0:
        return(0)
    else:
        c=1
        p=0
        s=0
        while(c<n):
              s+=c
              c,p=c+p,c
        return s

print(fibb(int(input()))) 