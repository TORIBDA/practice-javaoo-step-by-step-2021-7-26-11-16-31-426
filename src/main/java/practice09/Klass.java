package practice09;

import java.text.MessageFormat;
import java.util.Objects;

public class Klass {
    private int num;
    private Student leader;

    public Klass(int num) {
        this.num = num;
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
        member.setKlass(this);
    }

    public boolean isIn(Student student)
    {
        return this.equals(student.getKlass());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return num == klass.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
