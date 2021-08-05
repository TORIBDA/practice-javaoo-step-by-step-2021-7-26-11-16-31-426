package practice06;

import java.text.MessageFormat;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return klass != null ?
                (super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + ".") :
                (super.introduce() + " I am a Teacher. I teach No Class.");
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduceWith(Student student) {
        return MessageFormat.format("{0} I am a Teacher. I {1}{2}.", super.introduce(),
                (klass.equals(student.getKlass()) ? "teach " : "don't teach "),
                student.getName());
    }
}
