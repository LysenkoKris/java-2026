package laba2;

public class Task4 {
    // Класс Person
    static class Person {
        private String name;
        private int age;
        private String gender;

        // Конструктор
        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        // Геттеры
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }

        // Сеттеры
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        // toString для удобства вывода
        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + ", gender='" + gender + "'}";
        }
    }

    public static void main(String[] args) {
        // Создание объекта через конструктор
        Person person = new Person("Иван", 25, "мужской");
        System.out.println(person);

        // Изменение через сеттеры
        person.setAge(26);
        person.setGender("мужчина");
        System.out.println(person);
    }
}