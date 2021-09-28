# -- coding: utf-8 --
print("Ведите количество секунд")
seconds =int(input())
minutes=seconds//60
hours=minutes//60
days=hours//24
print(seconds," секунд - это ",minutes," минут, ",hours," часов, ",days," дней")