package practice02;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //"My name is Tom. I am 21 years old."
    public String introduce() {
        return "My name is " + name +". I am " + age + " years old.";
    }
}
