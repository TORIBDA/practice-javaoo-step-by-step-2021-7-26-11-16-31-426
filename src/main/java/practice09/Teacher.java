package practice09;

import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private LinkedList<Klass> klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce(){
        return klass!=null?
                MessageFormat.format("{0} I am a Teacher. I teach Class {1}.",
                        super.introduce(),
                        klass
                                .stream()
                                .map(klassValue-> String.valueOf(klassValue.getNumber()))
                                .collect(Collectors.joining(", "))):
                (super.introduce()+ " I am a Teacher. I teach No Class.");
    }

    public String introduceWith(Student student) {
        return MessageFormat.format("{0} I am a Teacher. I {1}{2}.", super.introduce(),
                (isTeaching(student)?"teach ":"don't teach "),
                student.getName());
    }

    public LinkedList<Klass> getClasses() {
        return klass;
    }

    public boolean isTeaching(Student student) {
        return klass.stream().anyMatch(klassValue ->klassValue.getNumber()==student.getKlass().getNumber());
//        for (Klass klassValue : klass) {
//            if(student.getKlass().getNumber()==klassValue.getNumber())
//            {
//                System.out.println("Current Klass: " + klassValue.getNumber());
//                System.out.println("Teacher is teaching the student");
//                return klassValue.isIn(student);
//            }
//        }
        //return klass.stream().filter(klassValue -> klassValue.isIn(student)).count() > 0;
    }
}
