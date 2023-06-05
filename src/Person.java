import java.util.StringJoiner;

public class Person {
        public String name;
        public String job;
        public String email;
        public String phone;
        public int zp;
        public int age;

    public Person(String name, String job, String email, String phone, int zp, int age) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.zp = zp;
        this.age = age;
    }
    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
            .add("ФИО: " + name)
            .add("должность: " + job)
            .add("email: " + email)
            .add("номер телефона: " + phone)
            .add("zp: " + zp)
            .add("age: " + age)
            .toString();
    }
    public static void main(String[] args) {
        Person Alex = new Person("NeVova", "QA", "qa@mail.ru", "79180194538", 50000, 18);
        System.out.println(Alex);
    }
//    public String getJob () {
//        return job;
//    }
//    public String getEmail () {
//        return email;
//    }
//    public String getPhone () {
//        return phone;
//    }
//    public String getName () {
//        return name;
//    }
//    public int getZp () {
//        return zp;
//    }
//    public int getAge () {
//        return age;
//    }
}
