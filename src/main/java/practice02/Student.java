package practice02;

public class Student extends Person {
    private int klass;
    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    //assertThat(tom.introduce()).isEqualTo("I am a Student. I am at Class 2.");
    @Override
    public String introduce(){
        return "I am a Student. I am at Class " + klass +".";
    }

    public int getKlass() {
        return klass;
    }
}
