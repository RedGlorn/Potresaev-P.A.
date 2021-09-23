# -- coding: utf-8 --
print ("1) Курс основы программироваиня начался")


print("2) ",16283*12302%3092)


print("3) введите возраст")
age =int(input())
print("Введите своё имя")
name =input()
if (age>=0) and (age<75):
    if age<16:
        print("Сначала нужно окончить школу!")              
        print("Тебе учиться ещё ",16 - age,"лет(года,год)")
    else:print("Поздравляем вы поступили в ВГУИТ") 
    
else:print("Вы слишком взрослый")

if (name=="Иван") or (name=="Ваня") or (name=="иван") or (name=="ваня"):
       print("Вы Иван")


print("4) Ведите количество секунд")
seconds =int(input())
minutes=seconds//60
hours=minutes//60
days=hours//24
print(seconds," секунд - это ",minutes," минут, ",hours," часов, ",days," дней")


print("5) Введите n")
n=int(input())
print(n+(n**2)+(n**3)+(n**4)+(n**5))

print("6) Введите x")
x=int(input())
print("Введите y")
y=int(input())
c=x
x=y
y=c
print("x - ",x,"y - ",y)


print("7) ВВедите число <number> ")
number=int(input())
if number==0:
       print("Ноль ни то, ни другое")
elif number%2==0:
       print("Число чётное")
else:
       print("Число нечётное")