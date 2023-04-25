package hw3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class hw3tasks {

    private static Random random = new Random();
    int x = random.nextInt(1);

    /**
     * TODO: 2. Переработать метод generateEmployee(). Метод должен возвращать
     * любого случайного сотрудника разного типа (Worker, Freelancer)
     * 
     * @return
     */
    public static Employee generateEmployee() {
        int x = random.nextInt(2);
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(900, 1500);
        int salaryIndex = random.nextInt(28, 31);
        int age = random.nextInt(19, 50);
        double hour = random.nextDouble(50, 240);
        double paymentPerHour = random.nextDouble(800, 2600);
        if (x > 0) {

            return new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], salary * salaryIndex, age);
        } else {
            return new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(10)], age, paymentPerHour, hour);
        }

    }

    public static void main(String[] args) {

        // Worker worker = new Worker("Глеб", "Григорьев", 120000);
        // System.out.println(worker);

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new AgeComparator());
        
        System.out.println("\n*** Отсортированный массив сотрудников ***\n");

        for (Employee employee : employees) {
        System.out.println(employee);
        }

        /*
         * int a = 2;
         * boolean f = true;
         * String str = "Hello!";
         * System.out.println(worker);
         * System.out.println(a);
         * System.out.println(f);
         * System.out.println(str);
         */

    }

}
// ///////////////////////создание своего Comparator/////////////////////////////////////////////////////
class AgeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
         return Integer.compare(o1.age, o2.age);
    }

}


class SalaryComparator implements Comparator<Employee> {

    // 1 0 -1
    @Override
    public int compare(Employee o1, Employee o2) {

        return Double.compare(o2.calculateSalary(), o1.calculateSalary());
        // return o1.calculateSalary() == o2.calculateSalary() ? 0 :
        // (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
    }
}

class SurNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.surName.compareTo(o2.surName);
    }

}

abstract class Employee implements Comparable<Employee>{
    protected String firstName;
    protected String surName;
    protected double salary;
    protected int age;
    protected double paymentPerHour;
    protected double hour;

    public Employee(String firstName, String surName, double salary, int age) {
        this.firstName = firstName;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    public Employee(String firstName, String surName, int age) {
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;

    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; Ставка: %.2f; Среднемесячная заработная плата: %.2f",
                surName, firstName, salary, calculateSalary());
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(calculateSalary(), o.calculateSalary());
    }
    

}

class Worker extends Employee {

    public Worker(String firstName, String surName, double salary, int age) {
        super(firstName, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s;  Возраст %d; Рабочий; Среднемесячная заработная плата: %.2f",
                surName, firstName, age, calculateSalary());
    }
}

/**
 * TODO: 1. Разработать самостоятельно в рамках домашней работы.
 */
class Freelancer extends Employee {
    protected double paymentPerHour;
    protected double hour;

    public Freelancer(String firstName, String surName, int age, double paymentPerHour, double hour) {
        super(firstName, surName, age);
        this.paymentPerHour = paymentPerHour;
        this.hour = hour;

        // TODO Auto-generated constructor stub
    }

    @Override
    public double calculateSalary() {

        return paymentPerHour * hour;

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s %s; Возраст %d;  Фриласнсер; Среднемесячная заработная плата: %.2f", surName,
                firstName, age, calculateSalary());
    }

}
