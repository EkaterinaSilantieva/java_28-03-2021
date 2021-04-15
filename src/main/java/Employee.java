public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone_number;

    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;

        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return String.format("Имя пользователя: " + name + "; Должность: " + position + "; Email: " + email + "; Телефон: " + phone_number + "; Заработная плата: " + salary + "; Возраст: " + age);
    }

    public void print() {
        System.out.println(this);
    }


    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Яковлева Катерина Игоревна", "Генеральный директор", "KaterinaYakovleva84@mail.ru", "+7 (933) 570-07-61", 250000, 53);
        persArray[1] = new Employee("Аллилуев Георгий Степанович", "Системный администратор", "georgiy.alliluev@gmail.com", "+7 (928) 251-81-65", 27000, 40);
        persArray[2] = new Employee("Коржева Галина Антоновна", "Менеджер", "galina38@ya.ru", "+7 (959) 741-46-44", 25000, 33);
        persArray[3] = new Employee("Доскаль Семен Наумович", "Диспетчер", "semen43@mail.ru", "+7 (949) 944-52-72", 18000, 59);
        persArray[4] = new Employee("Митрохин Кирилл Севастьянович", "Веб-программист", "kirill1971@outlook.com", "+7 (975) 279-22-51", 38000, 48);

        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();
    }
}