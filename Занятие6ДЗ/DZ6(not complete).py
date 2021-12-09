#-- coding: utf-8 --
from tkinter import *
from tkinter import ttk
from tkinter import scrolledtext

def cl1():
    scrtxt1.delete(1.6,END)
    N = int(txt1.get())
    i = 0
    while i <= N:
        i = i**2
        scrtxt1.insert(INSERT, i)
        scrtxt1.insert(INSERT, " ",)
        i = i+1

def cl2():
    N = int(txt2.get())
    i = 2
    while N % i != 0:
        i +=1
    scrtxt2.insert(INSERT, i,)

def cl3():
    N = int(txt3.get())
    d = 2
    step = 1
    while d <= N:
        step +=1
        d *= 2
    scrtxt3.insert(INSERT, step-1)
    scrtxt3.insert(INSERT, "\nЧисло ")
    scrtxt3.insert(INSERT, d//2 )

def cl4():
    x = int(txt4.get())
    y = int(txt4_1.get())
    i = 1
    while x < y:
        x *= 1.1
        i += 1
    scrtxt4.insert(INSERT, i)

def cl5(_i=[0]):
    x = int(txt5.get())
    _i[0]+=1
    if x==0:
        scrtxt5.delete (1.33,END)
        scrtxt5.insert(INSERT, _i[0]-1)
        _i[0]=0

#def cl6(summ,dl):
 #   n = int(txt6.get())
  #  if n != 0:
   #     summ += n
    #    dl += 1
    #else:
     #   scrtxt6.delete(1.17, END)
      #  scrtxt6.insert (INSERT,summ/dl)
   # return (summ,dl)




window = Tk()
window.title("MAIN WINDOW")
window.geometry('800x600')

tab_control = ttk.Notebook(window)
tab1 = ttk.Frame(tab_control)
tab_control.add(tab1, text='N1')
tab2 = ttk.Frame(tab_control)
tab_control.add(tab2, text='N2')
tab3 = ttk.Frame(tab_control)
tab_control.add(tab3, text='N3')
tab4 = ttk.Frame(tab_control)
tab_control.add(tab4, text='N4')
tab5 = ttk.Frame(tab_control)
tab_control.add(tab5, text='N5')
tab6 = ttk.Frame(tab_control)
tab_control.add(tab6, text='N6')
tab7 = ttk.Frame(tab_control)
tab_control.add(tab7, text='N7')
tab8 = ttk.Frame(tab_control)
tab_control.add(tab8, text='N8')
tab_control.pack(expand=1, fill='both')

#первая вкладка - первая задача
lb1 = Label(tab1, text="Введите целое число N", font=("Arial bold", 20)) 
lb1.grid(column=0, row=0)
txt1 = Entry(tab1, width=10)
txt1.grid(column=0, row=1)
bt1 = Button(tab1, text="Решить", command=cl1)
bt1.grid(column=1, row=1)
scrtxt1 = scrolledtext.ScrolledText(tab1, width=60, height=10)
scrtxt1.grid(column=0, row=3)
scrtxt1.insert(INSERT, 'Ответ ')

#вторая
lb2 = Label(tab2, text="Введите целое число N", font=("Arial bold", 20)) 
lb2.grid(column=0, row=0)
txt2 = Entry(tab2, width=10)
txt2.grid(column=0, row=1)
bt2 = Button(tab2, text="Решить", command=cl2)
bt2.grid(column=1, row=1)
scrtxt2 = scrolledtext.ScrolledText(tab2, width=60, height=10)
scrtxt2.grid(column=0, row=3)
scrtxt2.insert(INSERT, 'Наименьший натуральный делитель числа ')

#третья
lb3 = Label(tab3, text="Введите целое число N", font=("Arial bold", 20)) 
lb3.grid(column=0, row=0)
txt3 = Entry(tab3, width=10)
txt3.grid(column=0, row=1)
bt3 = Button(tab3, text="Решить", command=cl3)
bt3.grid(column=1, row=1)
scrtxt3 = scrolledtext.ScrolledText(tab3, width=60, height=10)
scrtxt3.grid(column=0, row=3)
scrtxt3.insert(INSERT, 'Показатель степени ')

#Четвёртая
lb4 = Label(tab4, text="Введите целые числа x и y", font=("Arial bold", 20)) 
lb4.grid(column=0, row=0)
txt4 = Entry(tab4, width=10)
txt4.grid(column=0, row=1)
txt4_1 = Entry(tab4, width=10)
txt4_1.grid(column=1, row=1)
bt4 = Button(tab4, text="Решить", command=cl4)
bt4.grid(column=2, row=1)
scrtxt4 = scrolledtext.ScrolledText(tab4, width=40, height=5)
scrtxt4.grid(column=0, row=3)
scrtxt4.insert(INSERT, 'День  ')

#Пятая
lb5 = Label(tab5, text="Вводите числа поочереди и нажимайте на кнопку", font=("Arial bold", 20)) 
lb5.grid(column=0, row=0)
txt5 = Entry(tab5, width=50)
txt5.grid(column=0, row=1)
bt5 = Button(tab5, text="Жмак", command=cl5)
bt5.grid(column=2, row=1)
scrtxt5 = scrolledtext.ScrolledText(tab5, width=40, height=5)
scrtxt5.grid(column=0, row=3)
scrtxt5.insert(INSERT, 'Количество введённых чисел равно  ')

#Шестая
#lb6 = Label(tab6, text="Вводите числа поочереди и нажимайте на кнопку", font=("Arial bold", 20)) 
#lb6.grid(column=0, row=0)
#txt6 = Entry(tab6, width=50)
#txt6.grid(column=0, row=1)
#bt6 = Button(tab6, text="Жмак", command=cl6)
#bt6.grid(column=2, row=1)
#scrtxt6 = scrolledtext.ScrolledText(tab6, width=40, height=5)
#scrtxt6.grid(column=0, row=3)
#scrtxt6.insert(INSERT, 'Среднее значение  ')


window.mainloop()