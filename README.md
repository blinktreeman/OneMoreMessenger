# OneMoreMessenger

В решении используются два базовых класса - Person и Message.
Person может отноститься к трем группам пользователей: User, Moderator, Administrator.

Для User определено: 
- создание сообщения, 
- чтение сообщений если отправитель и получатель не являются парой Администратор-Модератор
- изменение, удаление собственных сообщений

Для Moderator дополнительно:
- чтение, изменение, удаление собственных сообщений и сообщений User
- запрет User на отправку сообщений

Для Administrator:
- CRUD всех сообщений
- добавление, удаление пользователей

Предоставление методов для экземпляров Person выполнено с помощью паттерна abstract factory.
Выполнены интерфейсы для каждого действия (создание, чтение etc) и их реализации для каждого типа пользователя

Далее выполнен интерфейс ActionAbstractFactory и классы, которые его имплементируют для каждого типа пользователей

Предоставление методов для Person выполнено с помощью dependency injection

Хранение, CRUD операции с экземплярами Person, Message реализовано в двух классах (singleton?) Community, MessageData
