package ru.geekbrains.lesson3.task2;

import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();


    /**
     * TODO: Переработать метод generateEmployee, метод должен генерировать
     *   случайного сотрудника типа Worker или Freelancer
     * @return
     */
    public static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salaryIndex = random.nextInt(500, 900);
        int yearOfBirthday = random.nextInt(1970, 1996);
        double salaryRateIndex = random.nextInt(300,800);
        int index = random.nextInt(0,2);
        if (index == 1){
            return
                    new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salaryIndex * 100, yearOfBirthday);

                    }
        else return new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salaryRateIndex, yearOfBirthday);


    }



    public static Employee[] generateEmployees(int counter){
        Employee[] employees = new Employee[counter];
        for (int i = 0; i < employees.length; i++){
            employees[i] = (Employee) generateEmployee();
        }
        return employees;
    }

    public static void main(String[] args) {

        Employee[] employees = (Employee[]) generateEmployees(12);

        for (Employee employee: employees) {
            System.out.println(employee);
        }


        Arrays.sort(employees, new AgeComparator());

        System.out.println();

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        /*String str = "рабочий";
        int i = 12;
        boolean f = true;
        System.out.println(str);
        System.out.println(i);
        System.out.println(f );*/

    }
}
