package src.main.java;

import java.util.ArrayList;

//Вариант 4. Практическое задание 3. Преобразовать список сотрудников в список строк вида "Имя - Отдел".
//Необходимо реализовать предзаполненный список (тип “ArrayList<Employee>”) с объектами класса “Employee”, по которым будем выполняться задание.
//Необходимо создать не менее 5 элементов списка.
public class Prac3 {

    public void startStreamApi() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иванов Иван Иванович", 25, "It-Отдел", 10000.0));
        employees.add(new Employee("Петров Петр Петрович", 25, "Бухгалтерия", 10000.0));
        employees.add(new Employee("Сидоров Сидр Сидорович", 25, "Отдел инноваций", 10000.0));
        employees.add(new Employee("Кириллов Кирилл Кириллович", 25, "Ректорат", 10000.0));
        employees.add(new Employee("Антонов Антон Антонович", 25, "Отдел продаж", 10000.0));

        System.out.println("Результат преобразования списка сотрудников в формат 'Имя - Отдел':\n");

        employees.stream()
                .map(e -> e.getFullName() + " - " + e.getDepartment())
                .forEach(System.out::println);
    }

}
