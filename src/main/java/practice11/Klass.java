package practice11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Klass {
    int number;
    Student leader;
    Teacher teacher;
    Set<Student> members=new HashSet<>();
    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName(){
        StringBuilder sb=new StringBuilder();
        sb.append("Class ").append(number);
        return sb.toString();
    }
    public void assignLeader(Student leader){
        if(members.contains(leader)){
            this.leader=leader;
            StringBuilder sb=new StringBuilder();
            if(teacher!=null) {
                sb.append(teacher.getNameDisplay()).append(" I know ").append(leader.getName()).append(" become Leader of ").append(getDisplayName()).append(".");
                System.out.print(sb.toString() + "\n");
            }
        }else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }
    public void appendMember(Student member){
        members.add(member);
        StringBuilder sb=new StringBuilder();
        if(teacher!=null) {
            sb.append(teacher.getNameDisplay()).append(" I know ").append(member.getName()).append(" has joined ").append(getDisplayName()).append(".");
            System.out.print(sb.toString() + "\n");
        }
    }

    public boolean isIn(Student student){

        for (Student member:members){
            if(member.getId()==student.getId()){
                return true;
            }
        }
        return false;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
