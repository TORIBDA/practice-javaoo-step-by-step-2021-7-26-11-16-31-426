package practice09;

public class Person {
    private final String name;
    private final int age;
    private final int id;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String introduce() {
        return "My name is " + name +". I am " + age + " years old.";
    }

    @Override
    public boolean equals(Object objectValue) {
        return objectValue instanceof Person && ((Person) objectValue).getId() == this.id;
    }
}
