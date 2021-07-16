## Base

#### static 
создаёт общее значение для всех объектов 
Благодоря static можно обойтись без Math name = new Math ();
Статик = только в одном экземпляре  Пример:" 
public static int summ (int a, int b)
    return a + b; //в классе
int x = Math.summ (12, 23); }  переменная summ из класса Math в Main 

#### public /private/ protectd 
- public - доступен отовсюду
- private - доступ только внутри класса
- protected - видимые только для подклассов  
- Если нисего не ставить то доступ будет только в этом пакете

#### void    
Ничего не возвращает. Неопределенный тип данных. 
Под него не выделяется память. Смотри Методы и Функции 
Это и есть метод, т.е действие чего либо" 
   
#### Горячие клавиши" 
- Alt+insert - @Override/Constructor/Getter and Seter/toString/
- Alt+Enter - Подсказака и автозамена
- Ctrl+D - скопировать строку
- Ctrl+P - увидеть какие параметры может принимать метод
- Ctrl+Alt+v - вывести через переменную
- https://devcolibri.com/горячие-клавиши-intellij-idea/

#### Преобразование типов данных		  
- static int a = 2; static double b = 4.9; int c = (int) b; 
c - будет равно 4, такое преобразование убирает не целочисленное
- double d = a;  в таком случае можно  без ()
- char f = 'g';  также сюда можно добавить число символа
- int h = f;  так мы получим Юникод этого символа

#### Арифметические операции и переменные
int a = -4; Math.abs(a); // Модуль
Math.sin(a); // Синус
Math.PI; // Число Пи
Math.ceil(7.342); // Округление к наибольшему целому (равно 8.0)
Math.floor(7.342); // Округление к наименьшему целому (равно 7.0)
Math.max(20, 30, 40); Math.min(20, 30, 40); //наибольшее (40);наименьшее (20)
double p = Math.pow(2, 3); // 2 в степени 3 (8)
final int a;   // невозможно переназначить (переменные и методы)
null; если переменная отстутствует

#### Условия и Циклы
- == равно, != не равно, >= <=, || или, && и, !x - не переменная
- if () { } else if { } else {}
- switch (5) // { переключатель
   case 5:
   	System.out.println("5");
   	break;  } Если не указывать будут выполненые все кейсы ниже
   default;  кейс если не выполнился не один кейс

- for (int i =0; i > 10; i++) {}
- int i = 0;
   while (i < 10) {i++}

- for (String s : st) {} // Позволяет ходить по спискам.
Список состоит из строк. В переменную s будет по очереди помощенны данные

#### Ввод и вывод
- Принятие данных в одной строке
for(int i=0;i<3;i++) //{
   String input = sc.nextLine();
   String[] values = input.split(" ");
   String name = values[0];
   int points = Integer.parseInt(values[1]);
   game.addPlayer(name, points);
} Принимает имя и кол. очков в одной строе.
Далее разделяет имя и очки в разные переменные. 
- "\n" - новой строки
String[] st = "Hello World".split(" ");  
"Разбиваем строку на два слова
st - список в котором харниться отдельно Hello и World" 
- System.err.println(); // вместо out - err. будет подсвеченно красным (ошибка) 
- Строка наоборот"
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
		System.out.println("\n"); 

#### Методы, функции  и Классы" /* 
Метод то что умеет делать Класс. Функция то что выполняет какие либо действия.
- static void calcSum (int a, int b) {
   int sum = a + b; 
   System.out.println(sum); }
Ничего не возвразает, все происход внутри функции
- static int calcSum (int a, int b) { 
	int sum = a + b; 
   return sum; }
Можем использоват переменную в main и уже там вывести

#### Массивы
- int nums1 [] = new int[i]; // i кол. элементов
nums1 [n] = 2; // - n индекс числа 2 в массиве
- int [ ] nums2 = {1, 20, 32, 4}; // задать масив проще через фигурные
- for (int n : nums2) {System.out.println(n);} //Вывести все эл. массива
- nums2.length; // Вывексти длину массива

#### Коллекции (Динамические массивы)
"Коллекции - Массивы в которые мы можем добавлять/удалять/менять элементы
Collection и Map  Интерфейсы 
   /   |   \
List, Set, Queve  Наследники Collection 
List - список, можно добавлять всё что угодно (независимо есть ли такой эл.)
Set - можно добавлять только те эл. которых нет в списке (эл. не дублируются)
Queve - очередь 
Map - хранит пары эл. (id - эл.). "

##### Интерфейс List (ArrayList)
- ArrayList colors1 = new ArrayList(); 
создание списка с разными типами данных
- ArrayList<String> colors2 = new ArrayList<String>(10);
создание списка строк с начальной длиной 10
- ArrayList<Integer> colors2 = new ArrayList<Integer>(12);
создание списка чисел с начальной длиной 12
Список хранить ОБЪЕКТЫ. Поэтому указываетя именно тип класса 
Integer, Double...

- List list1 = new ArrayList(); // создание в main. 
list1.add(2); // добавляем занчения
list1.add("Hello"); // Список с разными данными
List<Integer> list2 = new ArrayList(); // Список с конкретным типом данных
list2.add(2);
list2.add(5);
   System.out.println(list2.get(0)); 
	вызываем с помощью get(Индекс)
list2.remove(0); // удалить эл. с индексом 0. при удалении индексы сдвигаются

- for (int n: list2)  { //перебор всех элементов ы списке
   System.out.println(n); } 
list2.indexOf(x); // получает индекс элемента x
list2.addAll(y); // добавляет входящую коллекцию уже к текущей
list2.clear(); // очищает полность список
list2.contains(); // сравнивает коллекции по одному элементу (Поиск конкретного)
list2.containsAll(); // сравнивает коллекции всех элементов
list2.iterator(); // прежде чем им пользоваться нужно задать его через переменную
Iterator<Integer> iterator1 = list2.iterator();
iterator1.hasNext(); // Проверяет есть ли следующий элемент
iterator1.next(); // передвигается на первый элемент

- while (iterator1.hasNext())  { 
для вывода всех эл. коллекции list
   System.out.println(iterator1.next()); }
iterator1.remove(); // удаляет тот элемент на которм стоит указатель
 boolean empty1 = list2.isEmpty(); говорит пуста ли наша коллекция. есть = false
	 

##### Интерфейс Set (Linkedlist)
- Set<String> set1 = new HashSet<>(); 
HashSet только один из способов
set1.add("string1"); Добавить есть, а вывести (get) нет
set1.add("string1");
set1.add("string1");
Iterator<String> iterator2 = set1.iterator(); 

- while (iterator2.hasNext()) {  для вывода всех эл. коллекции Set
   System.out.println(iterator2.next()); }
В таком случае выведеться string1, только один раз
т.е он просто не добавляет одинаковые эл.
set1.remove("string1"); 

- for (String s: set1)  { упрощённый вывод
   System.out.println(s); }

set1.clear(); set1.addAll(); set1.contains(); set1.containsAll(); set1.isEmpty();
set1.removeAll();  удалит все эл. из set1, которые совпадают с передаваемой коллецией
	 

##### Интерфейс Map
- Map<String, Integer> map1 = new HashMap<>(); 
Принимает пару: Индекс(Ключ) и Значение [key1: 2][key2: 2][key3: 0][key4: 1]
Ключ должен быть уникальным, а значение может повторяться (4 элемента) 
Если добавлять элемент с ключом который уже есть, он просто перезапишется 
map1.put("key1", 2);
map1.put("key2", 0);
map1.put("key3", 1);
map1.put("key4", 55); // в Map не итератор, поэтому

- Integer key2 = map1.get("key2"); 
Чтобы вывести через переменную вводим ключ
   System.out.println(key2);
map1.remove("key4"); // удалить

- Set<String> strings3 = map1.keySet(); // Выводим списко ключей через Set
- for (String k : strings3) // { Так мы получим списко ключей
   System.out.println(k); // } key4, key 3, key2, key1
Так ключи будет в произвольном порядке (или в обратно, но это не точно)"
map1.keySet(); // можно вывести так, но значения буду в ввиде массива

- for (Integer k2 : map1.values()); //{  так мы получим все значемния
   System.out.println(k2); // }  55, 1, 0, 2

- map1.containsKey(); // Проверяем есть ли конкретный ключ false\true
map1.containsValue(); // Проверяем есть ли такое значение false\true
 Остальное всё как в лист "

- Пример как можно добавить в MAP разные значения с одной строки 
for (int i = 1; i < amountPlayers; i++) {
	String nameAndScorePlayer = scanner.nextLine(); 
	String [] values = nameAndScorePlayer.split(" ");
	String name = values[0];
	int score = Integer.parseInt(values[1]); 
}


#### Конструкторы. 

- public Cat(int age, String catBreed, String name) {
   this.age = age;
   this.catBreed = catBreed;
   this.name = name; } 
Название обязательно должно совпадать с название класса.
У конструктора нет типа данных, это его отличает от метода"
this - Нужно чтобы задать переменной из начала класса (private int age;)
значение которые мы задаём через конструктор. public Cat(int age...
Без this переменная конструктора будет равана переменной конструктора. "

- в Main 
вместо 3 строчек:
cat1.setAge (4);
cat1.setCatBreed ("Pers");
cat1.setName ("Barsik");
Теперь можно задать все параметры в Main одной строчкой
cat1 = new Cat (2, "Pers", "Barsik");
new ; по сути мы вызываем конструктор.
Конструктор есть в классах по умолчанию, даже если мы его не создавали (Он просто пустой)
    
##### Наследование/Полиморфизм/Абстарктные классы

##### Наследование
- public class Sportsman extends People {}  
унаследование класса
Создаём конструктор так как в people он уже есть";
public Sportsman (String name, String lastName, int age, Cat cat) {
в классе должен быть такой же конструктор но уже с пременными 
т.е низший класс передаст данные введенные в него в родительский" ;
- Пример
class Animal { // Есть класс Animal
	protected int legs;
	у представителей класса Animal есть legs
	public viod eat () { Sysout("Animal eat"); } 
class Dog extends Animal {  // чтобы сделать подкласс Dog
	Dog () {  
		legs = 4; // у всех представителей Класса  Dog, legs будет равно 4
	}
} 

"В main";
Dog dog1 = new Dog(); // создали первую собаку 
dog1.eat; // вызвали метод из супер класса (Animal)


##### Полиморфиз - переопределение методов
Возможность объектов с одинаковой спецификацие иметь разную реализацию
В классах наследниках мы можем переопредилить метод";
public void sayHello() {System.out.println("HHello, people!");} 

- В наследнике
@Override 
public void sayHello() {System.out.println("Hello, people!"); }  
Если вызывть в main через наследника он выдаст Hello, people! 

##### Абстрактные классы
Класс в которых перечисляется всё что делают объекты этого класса ";
- public abstract class Animal {
   abstract void eat (); 
   abstract void say (); }
public class Cat extends Animals { } 
Вызвать абстрактный метод в Main
Мы НЕ МОЖЕМ создать екземпляр этого класса в Main"
   Animals a = new Animals ();
- В классах наследниках методы реализуются через переопределение @Override 
public void eat () {System.out.println("I am eat");}

- Purchase specialCustomer = new Purchase()  {
	@Override  //Создание объекта сразу же с переопределением
   public int totalAmount(int price) {
      return price - (price*20)/100;
   } }; 

##### Интерфесы (Исполнения)
public interface Array {}} //автоматически static и abstract
показывают что будет происходить в классе, но не реализовывать его.
- public class MyArray implements Array {}
через запятую можно несколько интерфесов"
- реализовывать интерфейс Array в классе MyArray.
@Override // переписывает метод и реализуем его
в интерфейсах все переменные константы
Поэтому в интерфейсах чаще указывает Что будет делать объект" 

##### Перегрузка методов 
Это возможность перегрузить уже существующий метод, 
для изменения его функционала, не переименовывая 
Короче, разиличное исполнение методов в зависимости от 
загруженных в него переменных (int) (String) ()

- MethadExam exam1 = new MethadExam();
   exam1.get(); // ничего не передаёт
   exam1.get("Hello MF"); // Принимает строку
   exam1.get(7); // принимает число
   "Одно и тоже имя у метода
   Имеет разные типы данных и их количество
	 
- Правила Переопределения Методов: 
	- Должны иметь одинаковые возвращаемый тип и аргументы  
	- Уровень доступа может быть более ограничивающим, чем уровень доступа переопределенных методов. (Например: Если метод суперкласса объявлен как public, то переопределенный метод в подклассе не может быть ни private ни protected) 
	- Метод, объявленный с помощью ключевых слов final или static не может быть переопределен  
	- Если метод не может быть наследован, то он не может быть переопределен  
	- Конструкторы не могут быть переопределены*/

##### Исключения 
Чтобы не выдавало ошибку в коде или при вводе данных пользователем vожно указать какая ошибка возможна и что делать в таком случае
- String[] st = new String[2]; //Создаём массив из двух эл.
   System.out.println(st[5]); // 
Выдаст ошибкуArrayIndexOutOfBoundsException
try  { // пишем в блок код в котором может возникнуть ошибка
    System.out.println(st[5]);
    }  catch (ArrayIndexOutOfBoundsException er)  {
        "пишем ошибку которую ожидаем и переменную "er" в которую поместим ошибку" 
        er.printStackTrace(); // Чтобы показать ошибку
        System.out.println("Error MF"); // Показать пользователю текст
    }
- Если не знаем какую ошибку выдаст мы можем указать Exception 
Либо Throwable. Разные классы ошибок. Если не попасть в класс выдаст ошибку" 

##### Принудительный исключения "
throw new MyException(); создаnmn новое исключение.
Если засунуть его в true catch, мы вызывем его"
public static void main(String[] args) throw MyException
"Нужно добавить полсе Main. Говорит о том что в этом методе есть такое исключение
далее обрабатываем с помощью true catch. 
в классе добавляем @override (см класс)" 
