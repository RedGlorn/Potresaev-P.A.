# -- coding: utf-8 --
print("введите возраст")
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