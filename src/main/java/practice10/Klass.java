package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    int number;
    Student leader;
    List<Student> members=new ArrayList<>();
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
        }else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }
    public void appendMember(Student member){
        members.add(member);
    }

    public boolean isIn(Student student){

        for (Student member:members){
            if(member.getId()==student.getId()){
                return true;
            }
        }
        return false;
    }
}
