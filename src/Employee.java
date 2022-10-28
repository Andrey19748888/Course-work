public class Employee {
    private String fio;
    private int otdel;
    private int salary;

    private static int counter = 1;
    private int id;



    private String firstName;
    private String middleName;
    private String lastName;
    String fullName = lastName + " " + firstName + " " + middleName;

    public String toString() {
        return "\nномер " + id + "\nФИО " + fio + "\nномер отдела " + otdel + "\nзарплата " + salary;

    }

    public Employee(String fio, int otdel, int salary) {
        this.fio = fio;
        this.otdel = otdel;
        this.salary = salary;

        this.id = counter;
        counter++;
    }


    public String getFio() {
        return fio;
    }

    public int getOtdel() {
        return otdel;
    }

    public int getSalary() {
        return salary;
    }

    public int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void cetId(int id) {
        this.id = id;
    }

}

