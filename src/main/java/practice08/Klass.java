package practice08;

public class Klass {
    int number;
    Student leader;
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
       this.leader=leader;
    }

    public Student getLeader() {
        return leader;
    }
}
