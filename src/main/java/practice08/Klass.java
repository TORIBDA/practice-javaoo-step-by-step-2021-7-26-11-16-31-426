package practice08;


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
            //leader would be null here which would result to failed case
            this.leader = leader; //for testing purposes
            System.out.println("It is not one of us.");
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
}
