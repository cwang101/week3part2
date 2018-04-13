package practice03;

public class Student extends Person{
    int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }
    public String introduce(){
        StringBuilder sb=new StringBuilder();
        sb.append("I am a Student. I am at Class ").append(klass).append(".");
        return sb.toString();
    }
}
