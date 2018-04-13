package practice05;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }
    public String introduce(){
        StringBuilder sb=new StringBuilder();
        sb.append(super.introduce()).append(" I am a Worker. I have a job.");
        return sb.toString();
    }
}
