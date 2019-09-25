public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван Иванович", "Ведущий специалист", "ivanov@test.ru", 48000, 1000, 25);
        persArray[1] = new Person("Петров Петр Петрович", "Специалист", "petrov@test.ru", 48001, 2000, 45);
        persArray[2] = new Person("Сидоров Сидор Сидорович", "Ведущий специалист", "sidorov@test.ru", 48002, 3000, 41);
        persArray[3] = new Person("Иванова Елизавета Владимировна", "Ведущий специалист", "ivanova@test.ru", 48003, 4000, 30);
        persArray[4] = new Person("Гончарова Наталья Николаевна", "Ведущий специалист", "goncharova@test.ru", 48004, 5000, 28);
        for (int i = 0; i < persArray.length; i++) {
           persArray[i].info();
       }
    }
}
