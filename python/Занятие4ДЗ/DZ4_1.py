#-- coding: utf-8 --

def ctr():	
	print("ВВедите строку")
	ctrok=input()    
	print(ctrok[2])
	print(ctrok[-2])
	print(ctrok[0:5])
	print(ctrok[0:-2])
	print(ctrok[0::2])
	print(ctrok[1::2])
	print(ctrok[::-1])
	print(ctrok[::-2])
	print(len(ctrok))

ctr()