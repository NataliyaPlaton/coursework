package coursework;

public class Employee {
    private static int counter;
    private Integer id;
    private String name;
    private String patronymic;
    private String surname;
    private int department;
    private int salary;

    public Employee(String name, String patronymic, String surname, int department, int salary) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public Integer getId() {
        return this.id;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", Фамилия: " + name +
                ", Имя: " + patronymic +
                ", Отчество: " + surname +
                ", отдел=" + department +
                ", зарплата=" + salary;
    }
}
