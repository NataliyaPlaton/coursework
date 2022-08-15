package coursework;

public class Main {

    private static final Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        Employee empl1 = new Employee("Иванов", "Иван", "Иванович", 1, 50_000);
        Employee empl2 = new Employee("Петров", "Петр", "Петрович", 1, 60_000);
        Employee empl3 = new Employee("Сидоров", "Сидор", "Сидорович", 2, 100_000);
        Employee empl4 = new Employee("Борисов", "Борис", "Борисович", 2, 110_000);
        Employee empl5 = new Employee("Васильев", "Василий", "Васильевич", 3, 80_000);
        Employee empl6 = new Employee("Глебов", "Глеб", "Глебович", 3, 90_000);
        Employee empl7 = new Employee("Дмитриев", "Дмитрий", "Дмитриевич", 4, 105_000);
        Employee empl8 = new Employee("Егоров", "Егор", "Егорович", 4, 115_000);
        Employee empl9 = new Employee("Захаров", "Захар", "Захарович", 5, 75_000);
        Employee empl10 = new Employee("Кириллов", "Кирилл", "Кириллович", 5, 85_000);

        employees[0] = empl1;
        employees[1] = empl2;
        employees[2] = empl3;
        employees[3] = empl4;
        employees[4] = empl5;
        employees[5] = empl6;
        employees[6] = empl7;
        employees[7] = empl8;
        employees[8] = empl9;
        employees[9] = empl10;

        System.out.println("Список всех сотрудников");
        printEmployees();
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateAllSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary());
        System.out.println("Среднее значение зарплат: " + calculateAllSalary() / employees.length);
        System.out.println();
        System.out.println("Список Ф.И.О. всех сотрудников: ");
        printFullName();

    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    public static int calculateAllSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;


    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static void printFullName() {
        for (Employee value : employees) {
            System.out.println(value.getName() + " " + value.getPatronymic() + " " + value.getSurname());
        }
    }

}
