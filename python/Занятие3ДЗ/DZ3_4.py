# -- coding: utf-8 --
def sm(N, s):
	for i in range(N):
		s=s+int(input())
	print(s)

print("Введите число N")
N = int(input())
s = 0
sm(N, s)