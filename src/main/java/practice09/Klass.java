package practice09;

import practice08.Person;

import java.text.MessageFormat;
import java.util.LinkedList;

public class Klass {
    private int num;
    private Student leader;
    private LinkedList<Student> members;

    public Klass(int num) {
        this.num = num;
        members = new LinkedList<Student>();
    }

    public int getNumber() {
        return num;
    }

    public String getDisplayName() {
        return MessageFormat.format("Class {0}", num);
    }

    public void assignLeader(Student leader) {
        if(leader.getKlass().getNumber()==this.num) {
            this.leader = leader;
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student member) {
        if(member.getKlass().getNumber()==this.num)
        {
            members.add(member);
        }
    }

    public boolean isIn(Student student)
    {
        System.out.println("Student Class: " + student.getKlass().getNumber());
        System.out.println("Is a Member: " +  members.contains(student));
        System.out.print("Members: ");
        members.forEach(member-> System.out.println(member.getKlass().getNumber()));
        System.out.println();
        System.out.println();
        return members.contains(student);
    }
}
