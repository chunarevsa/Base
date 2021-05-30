package com.company.People;
import com.company.Cat; // импортируется так так в разных пакетах

public class People {
    private String name;
    private String secondName;
    private int age;

    private Cat cat; // Задаём что у человека есть кот (такой параметр как кот)

    @Override
    public String toString() {
        return "People["+name+", "+secondName+", "+age+ ",\n Есть кот: "+cat;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}
