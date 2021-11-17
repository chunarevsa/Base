## Spring 

Фреймворк - каркас(основание) для приложения. Задаёт архитектуру приложения.
Hibernate - фреймворк для работы с БД
Junit 5(4) - фреймворк для тестов

Api Application Programm Interface - Стандарт (язык общения запрос-ответ)

Java EE - Java Enterprise Edition (дополнение к Java Standart Edition)
По сути это набор спецификаций, (интерфейсов и анотаций) 
Примеры JpaRepo... 
Java transaction api - транзакции
Java JSR 303: Bean Validation - @Valid

Spring 
+ Удобно, много решений
+ Подходит для микросервисов 

Spring Boot - Это автоконфигурирование модулей

#### Модули 
Spring Core (IoC/DI)
Spring AOP (Аспектно ориентированное программирование)
Spring Data
Spring Web
Spring Security
SPring Reactive (Обробатываение запросов с большим количеством пользователей?)
Spring Integration (Прочее)
Spring Actuator (для проверки состояния приложения (для микросервисов))
Spring Cloud (интуструмент для работы в облаке (для микросервисов))
Support, Community  (Документация)

#### IoC/DI

Inversion of Control / Dependency Injection
Инверсия управления  / Внедрение зависимостей

private final UserRepository userRepository
(final- запрещает изменение ссылки в полях классов)

public UserService (UserRepository userRepository) {
	this.userRepository = userRepository;
}

Теперь UserService не отвечает за создание UserRepository. 







