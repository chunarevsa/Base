package com.company;
import com.company.People.People; // подпапка

import java.util.*;

public class Main {

    public static void main(String[] args) {

" Горячие клавиши" /*
    Alt+insert - @Override/Constructor/Getter and Seter/toString/
    Alt+Enter - Подсказака и автозамена
    Ctrl+D - скопировать строку
    Ctrl+P - увидеть какие параметры может принимать метод
    Ctrl+Alt+v - вывести через переменную

    https://devcolibri.com/горячие-клавиши-intellij-idea/
           */

     /*static  { " создаёт общее значение для всех объектов 
             Благодоря static можно обойтись без Math name = new Math ();
         Статик = только в одном экземпляре  Пример:" 
        public static int summ (int a, int b)
            return a + b; //в классе
        int x = Math.summ (12, 23); }  переменная summ из класса Math в Main */

    /* public /private /"Getter and Seter" 
      public - "доступен отовсюду - private - доступ только внутри класса 
      Если нисего не ставить то доступ будет только в этом пакете" */

    /* "Getter and Seter" 
	 "Необходим чтобы получить доступ к переменным private
     Добавляются в классе в котором находят переменные" 
    public int getAge() { // Возвращает значение возраста
        return age; }
    cat.getAge();  // Так выводиться в Main
    cat.getCat().say();  // Так выводиться потому что в People private, хотя в cat public

    public void setAge(int age){  Устанавливает возраст
            this.age = age;
        }
    cat.setName("Barsik"); // Так задаётся в Main */
    
    /* void  "Ничего не возвращает. Неопределенный тип данных. 
     Под него не выделяется память. Смотри Методы и Функции 
     Это и есть метод, т.е действие чего либо" */
   
    "\n"    //  - новой строки
    String[] st = "Hello World".split(" ");  
	 "Разбиваем строку на два слова
	 st - спсок в котором харниться отдельно Hello и World" 

    System.err.println(); // вместо out - err. будет подсвеченно красным (ошибка)

/* " Логические опреаторы "
		  && - или
		  || - и 
*/

/*	"Видео Devcolibri Урок 9 Преобразование типов данных" 
    static int a = 2; static double b = 4.9; int c = (int) b;
    c - будет равно 4, такое преобразование убирает не целочисленное
    double d = a; // в таком случае можно  без ()
    char f = 'g'; // также сюда можно добавить число символа
    int h = f; // так мы получим Юникод этого символа

    ССылочные типы
    String st = "27"; Integer in = 2; Double dou = 7.8;
    Float fl = 2.6f; Short sh = 3;

    Number n = fl;
    Number n1 = dou;
    Number n2 = new Double(2.8);
    Можно не задавать заранее, а сделать сразу здесь
    Integer r1 = n.intValue();
    Integer r2 = n2.intValue();
    Number Необходим для преобразования либого ссылочного 
    типа в другой ссылочны тип (из Float в Integer)
    int t = fl.intValue(); // Преобразование не в ссылочный
    */

/*  "Видно Devcolibri 10 Арифметические операции и переменные" 
    int a = -4; Math.abs(a); // Модуль
    Math.sin(a); // Синус
    Math.PI; // Число Пи
    Math.ceil(7.342); // Округление к наибольшему целому (равно 8.0)
    Math.floor(7.342); // Округление к наименьшему целому (равно 7.0)
    Math.max(20, 30, 40); Math.min(20, 30, 40); //наибольшее (40);наименьшее (20)
    double p = Math.pow(2, 3); // 2 в степени 3 (8)

    final int a;   // невозможно переназначить (переменные и методы)
    null; если переменная отстутствует */

/* "Видно Devcolibri 11 Условия и Циклы"  
    == равно, != не равно, >= <=, || или, && и, !x - не переменная
    if () { } else if { } else {}
    switch (5) // { переключатель
        case 5:
            System.out.println("5");
            break; // } Если не указывать будут выполненые все кейсы ниже
        default; // кейс если не выполнился не один кейс

    for (int i =0; i > 10; i++) {}

    int i = 0;
    while (i < 10) {i++}  //

    for (String s : st) {} // Позволяет ходить по спискам.
        Список состоит из строк. В переменную s будет по очереди 
		   помощены данные

         Пример:
        for(int i=0;i<3;i++) //{
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
         } Принимает имя и кол. очков в одной строе.
         Далее разделяет имя и очки в разные переменные. */

/* "Видео Devcolibri Урок 14 и 19 Методы, функции  и Классы" 
    Метод и функция это одно и тоже. Пишутся вне метода main
    Метод то что умеет делать Класс. Функция то что выполняет какие либо действия. 
    static void calcSum (int a, int b) // Названия с малеьнокой, новые слова с большой
     в скобка перечисляем параметры которые будут нужны функции 
    calcSum(2, 9); //Вызываем в main
	
    static void calcSum (int a, int b) // Если выводи в самой функции значение
        int sum = a + b; //значит нам не нужно выводить его в main
            System.out.println(sum); // Поэтому void

    static int calcSum (int a, int b) // Если функции задаём тип данных
    int sum = a + b; //Можем использоват переменную в main и уже там вывести
    return sum; // Но тогда обязательно return (обязует вернуть в метод значение sum)
    int val = calcSum(2, 9); //

    "Объект (класс) Смотри класс Cat"
    static Cat cat1 = new Cat(); // Добавили нового кота (cat1)
    cat1.age = 4;
    cat1.catBreed = "Pers";
    cat1.name = "Barsik"; // Задали параметры первого кота.
    Можно вызвать сразу все параметры сразу (см в Cat)
    System.out.println(cat1);
    static People people1 = new People();
    "Человеку можно присвоить кота"
    people1.cat = cat1; // присвоили к первому человеку первого кота
    System.out.println(people1); // Также выведем все параметры сразу (см. класс)
    "Получается выводя человека также выводится данные кота (Клас в классе)""
    cat1.say(); // Кот решил мяукнуть (вызывается через класс кота)
    people1.cat.say(); // человек заставил кота мяукнуть (через человка) */

/* " Видео Devcolibri Урок 16 Массивы" 
    int nums1 [] = new int[i]; // i кол. элементов
    nums1 [n] = 2; // - n индекс числа 2 в массиве
    int [ ] nums2 = {1, 20, 32, 4}; // задать масив проще через фигурные
    for (int n : nums2) {System.out.println(n);} //Вывести все эл. массива
    nums2.length; // Вывексти длину массива

	 "Строка наоборот"
	 char massiv [] = string.toCharArray();
		char vissam [] = new char[massiv.length];
		int i = 1;
		for (char n : massiv) {
			vissam [massiv.length - i] = n;
			i++;
		}
		for (char p : vissam) {
			System.out.print(p);
		}
		System.out.println("\n"); */

 "Видео Devcolibri Урок 30 Коллекции (Динамические массивы) " 
    "Коллекции - Массивы в которые мы можем добавлять/удалять/менять элементы
       Collection и Map  Интерфейсы 
          /   |   \
    List, Set, Queve  Наследники Collection 
     List - список, можно добавлять всё что угодно (независимо есть ли такой эл.)
     Set - можно добавлять только те эл. которых нет в списке (эл. не дублируются)
     Queve - очередь 
     Map - хранит пары эл. (id - эл.). "

    /* "Интерфейс List " 
    List list1 = new ArrayList(); создание в main. 
    list1.add(2); // добавляем занчения
    list1.add("Hello"); // Список с разными данными
    List<Integer> list2 = new ArrayList(); // Список с конкретным типом данных
    list2.add(2);
    list2.add(5);
        System.out.println(list2.get(0)); // вызываем с помощью get(Индекс)
    list2.remove(0); // удалить эл. с индексом 0. при удалении индексы сдвигаются

    for (int n: list2) // { перебор всех элементов ы списке
        System.out.println(n); // }
    list2.indexOf(x); // получает индекс элемента x
    list2.addAll(y); // добавляет входящую коллекцию уже к текущей
    list2.clear(); // очищает полность список
    list2.contains(); // сравнивает коллекции по одному элементу (Поиск конкретного)
    list2.containsAll(); // сравнивает коллекции всех элементов
    list2.iterator(); // прежде чем им пользоваться нужно задать его через переменную
    Iterator<Integer> iterator1 = list2.iterator();
    iterator1.hasNext(); // Проверяет есть ли следующий элемент
    iterator1.next(); // передвигается на первый элемент

    while (iterator1.hasNext())  // {  для вывода всех эл. коллекции list
        System.out.println(iterator1.next());// }
    iterator1.remove(); // удаляет тот элемент на которм стоит указатель

    boolean empty1 = list2.isEmpty(); // говорит пуста ли наша коллекция. есть = false
	 */

    /* "Интерфейс Set" 
    Set<String> set1 = new HashSet<>(); // HashSet только один из способов
    set1.add("string1"); // Добавить есть, а вывести (get) нет
    set1.add("string1");
    set1.add("string1");
    Iterator<String> iterator2 = set1.iterator(); //
    while (iterator2.hasNext())  // {  для вывода всех эл. коллекции Set
          System.out.println(iterator2.next());// }
    "В таком случае выведеться string1, только один раз
    т.е он просто не добавляет одинаковые эл."
    set1.remove("string1"); //

    for (String s: set1) // { упрощённый вывод
        System.out.println(s); // }

    set1.clear(); set1.addAll(); set1.contains(); set1.containsAll(); set1.isEmpty();
    "как в List"
    set1.removeAll(); // удалит все эл. из set1, которые совпадают с передаваемой коллецией
	 */

    /* "Интерфейс Map" 
    " Map<String, Integer> map1 = new HashMap<>(); // есть ещё TreeMap
    Принимает пару: Индекс(Ключ) и Значение [key1: 2][key2: 2][key3: 0][key4: 1]
    Ключ должен быть уникальным, а значение может повторяться (4 элемента) 
    если добавлять элемент с ключом который уже есть, он просто перезапишется "
    map1.put("key1", 2);
    map1.put("key2", 0);
    map1.put("key3", 1);
    map1.put("key4", 55); // в Map не итератор, поэтому

    Integer key2 = map1.get("key2"); // чтобы вывести через переменную вводим ключ
            System.out.println(key2);
    map1.remove("key4"); // удалить

    Set<String> strings3 = map1.keySet(); // Выводим списко ключей через Set
    for (String k : strings3) // { Так мы получим списко ключей
        System.out.println(k); // } key4, key 3, key2, key1
    "Так ключи будет в произвольном порядке (или в обратно, но это не точно)"

    for (Integer k2 : map1.values()); //{  так мы получим все значемния
            System.out.println(k2); // }  55, 1, 0, 2

    map1.containsKey(); // Проверяем есть ли конкретный ключ false\true
    map1.containsValue(); // Проверяем есть ли такое значение false\true
    " Остальное всё как в лист "
	 */


/* "Видео Devcolibri Урок 17 Нейминг" 
    public class JavaExampelsCode {} // Классы
    int ageDog; // Переменные
    void getEmail () {} // Метод (Действия)
    public class Cat {} // Класс
	 */

/* "Видео Devcolibri Урок 21 Конструкторы. "
     "Конструктор создаётся в классе"
	      public Cat(int age, String catBreed, String name) {
            this.age = age;
            this.catBreed = catBreed;
            this.name = name;
    } 
	 "Название обязательно должно совпадать с название класса.
    У конструктора нет типа данных, это его отличает от метода"

    this "Нужно чтобы задать переменной из начала класса (private int age;)
    значение которые мы задаём через конструктор. public Cat(int age..
     Без this переменная конструктора будет равана переменной конструктора. "

    " в Main вместо 3 строчек"
        cat1.setAge (4);
        cat1.setCatBreed ("Pers");
        cat1.setName ("Barsik");
        "Теперь можно задать все параметры в Main одной строчкой"
        cat1 = new Cat (2, "Pers", "Barsik");
        " обращение к конструктору. Будут подсвечиваться подсказки"
        new ; " по сути мы вызываем конструктор.
         Конструктор есть в классах по умолчанию, даже если мы его не создавали 
         Он просто пустой"
			*/
    
 "Видео Devcolibri Урок 22/23 Наследование/Полиморфизм/Абстарктные классы" 
	 
   /* "Наследование"
    public class Sportsman extends People {} // унаследование класса
   import People.People // импортируем класс если он находиться в другом пакете
    "Создаём конструктор так как в people он уже есть "
    public Sportsman (String name, String lastName, int age, Cat cat) {
       super } 
		 " обращается к родительскому классу, а точнее к конструктору
     в классе должен быть такой же конструктор но уже с пременными 
     т.е низший класс передаст данные введенные в него в родительский " */

   /*"Полиморфиз"
    " возможность объектов с одинаковой спецификацие иметь разную реализацию
     В классах наследниках мы можем переопредилить метод "
    public void sayHello() {System.out.println("Hello!");} // в основном классе

    @Override // в наследнике
        public void sayHello() {System.out.println("Hello!MF"); 
			} // если вызывть в main через наследника он выдаст Hello!MF */

    /*"Абстрактные классы
    Класс в которых перечисляется всё что делают объекты этого класса "
    public abstract class Animal {
        abstract void eat ();
        abstract void say (); }
    public class Cat extends Animals {
		 
	 } // Вызвать абстрактный метод в Main
     "Мы не можем создать екземпляр этого класса в Main"
        Animals a = new Animals ();
     "В классах наследниках методы реализуются через переопределение"
        @Override // в наследнике
        public void eat () {System.out.println("I am eat");}

        Purchase specialCustomer = new Purchase()  {
         @Override  //Создание объекта сразу же с переопределением
            public int totalAmount(int price) {
                return price - (price*20)/100;
             }
         }; */

/* "Видео 22 Интерфесы (Исполнения)" {
        public interface Array {
		  	} //автоматически static и abstract
        "показывают что будет происходить в классе, но не реализовывать его."
        public class MyArray implements Array {} "через запятую можно несколько интерфесов"
        "реализовывать интерфейс Array в классе MyArray."
        @Override // переписывает метод и реализуем его
        "в интерфейсах все переменные константы
         Поэтому в интерфейсах чаще указывает Что будет делать объект" */

/* "Видео Devcolibri Урок 27 Перегрузка методов " 
    "Это возможность перегрузить уже существующий метод, 
     для изменения его функционала, не переименовывая 
    смотри класс MethadExam"
    MethadExam exam1 = new MethadExam();
    exam1.get(); // ничего не передаёт
    exam1.get("Hello MF"); // Принимает строку
    exam1.get(7); // принимает число
    "Одно и тоже имя у метода
    Имеет разные типы данных и их количество
    Ctrl+P - увидеть какие параметры может принимать метод" */

/* "Видео Devcolibri Урок 28, 29 Исключения " 
    "Чтобы не выдавало ошибку в коде или при вводе данных пользователем 
     Можно указать какая ошибка возможна и что делать в таком случае" 
    String[] st = new String[2]; //Создаём массив из двух эл.
        System.out.println(st[5]); // Выдаст ошибку ArrayIndexOutOfBoundsException

    try  { // пишем в блок код в котором может возникнуть ошибка
        System.out.println(st[5]);
    }  catch (ArrayIndexOutOfBoundsException er)  {
        "пишем ошибку которую ожидаем и переменную "er" в которую поместим ошибку" 
        er.printStackTrace(); // Чтобы показать ошибку
        System.out.println("Error MF"); // Показать пользователю текст
    }
    "Если не знаем какую ошибку выдаст мы можем указать Exception 
    Либо Throwable. Разные классы ошибок. Если не попасть в класс выдаст ошибку" 

    "Принудительный исключения "
        throw new MyException(); "создайм новое исключение. см класс MyException.
    Если засунуть его в true catch, мы вызывем его"
    public static void main(String[] args) throw MyException
    "Нужно добавить полсе Main. Говорит о том что в этом методе есть такое исключение
    далее обрабатываем с помощью true catch. 
     в классе добавляем @override (см класс)" */ 

" Видео 23 GUI Java (Визуальный) интерфейс. (см. Проет Number 6) "





}



