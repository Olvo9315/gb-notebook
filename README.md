# Урок 5. От простого к практике

1. Реализовано удаление пользователей с помощью метода DELETE в UserRepository. Для этого в UserView добавлен case DELETE.
2. Перенecены методы prompt и createUser из UserView в UserRepository. 
Так же перенесены методы из dao в UserRepository. Исправлены ошибки в Main, UserView и UserRepository. 
3. Из оптимизации, добавлен метод toUpperCase() в UserView для ввода команд, чтобы можно было вводить команду без учета регистра. 