public class Person {
    String fio;
    String post;
    String email;
    int phone;
    int salary;
    int age;

    public Person(String fio, String post, String email, int phone, int salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        if (age > 40)
        System.out.println("\nСотрудник: " + fio + "\nДолжность: " + post + "\nE-mail: " + email + "\nТелефон: " + phone + "\nЗарплата: " + salary + "\nВозраст: " + age);

    }
}
