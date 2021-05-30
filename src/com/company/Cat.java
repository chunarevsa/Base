package com.company;

public class Cat { // Это и есть объект
    private int age;
    private String catBreed;
    private String name;  // Параметры хар-ные для всего класса.

    public void say () { // Дейстиве кота
        System.out.println("Мяу!");
    }

    /* Вызове кота по имени в main (cat1) чтобы */
//  выводились все параметры, необходимо добавит в класс
    @Override // Нажимаем Alt + insert/Overide methods/toString
    public String toString() {
        // return super.toString(); } и после return написать(заменить):
        return "Cat[Имя: " + name + ", Порода: " + catBreed + "-" + age + "]";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;


    }
}
