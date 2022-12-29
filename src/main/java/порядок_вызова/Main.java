package порядок_вызова;

/*
1. Выполнятся блоки статической инициализации Person и Manager.
2. Выполниться блок инициализации и конструктор Person.
3. Выполнится блок инициализации и конструктор Manager.
 */

/**
 * Выполнение статического блока инициализации Person
 * Выполнение статического блока инициализации Manager
 * Выполнение блока инициализации Person
 * Выполнение конструктора Person
 * Выполнение блока инициализации Manager
 * Конструктор менеджера
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Vasya", 22);
    }
}
