package practice04;

public class Student extends Person{
    private int klass;
    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce(){
        return (super.introduce()
                + " I am a Student. I am at Class " + klass +".");
    }

    public int getKlass() {
        return klass;
    }
}
