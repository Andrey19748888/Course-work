import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Employee[] list = new Employee[10]; // [null, null, null, ...]
        Random r = new Random();

        for (int i = 0; i < list.length; i++ ) {
            list[i] = new Employee("fio",3,r.nextInt(80000));
        }

        printList(list);
        int sum = sumSalaries(list);

        System.out.println("Сумма затрат на зарплату за месяц: " + sum);
        System.out.println("Средняя зарплата сотрудника: " + avgSalary(list));
        System.out.println("Минимальная зарплата сотрудника: " + minSalary(list));
        System.out.println("Максимальная зарплата сотрудника: " + maxSalary(list));

    }

    public static void printList(Employee[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static int sumSalaries(Employee[] list) {

        int total = 0;
        for (int i = 0; i < list.length; i++) {
            total = list[i].getSalary() + total;
        }
        return total;
    }

    public static int avgSalary(Employee[] list) {
        return sumSalaries(list) / list.length;
    }
    public static int minSalary(Employee[] list) {
        int min = list[0].getSalary();
        for (int i = 1; i < list.length; i++) {
            if (min > list[i].getSalary()) {
                min = list[i].getSalary();
            }
        }
        return min;
    }

    public static int maxSalary(Employee[] list) {
        int max = list[0].getSalary();
        for (int i = 0; i < list.length; i++){
            if (max < list[i].getSalary()) {
                max = list[i].getSalary();
            }
        }
        return max;
    }



}