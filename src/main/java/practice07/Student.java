package practice07;

import java.text.MessageFormat;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return MessageFormat.format("{0} I am a Student. I am {1}{2}.",
                super.introduce(),
                ((klass.getLeader() != null && klass.getLeader().getName().equals(super.getName())) ? "Leader of Class " : "at Class "),
                klass.getNumber());
    }

    public Klass getKlass() {
        return klass;
    }
}
