package practice07;

public class Student extends Person{
    Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        StringBuilder sb=new StringBuilder();
        sb.append(super.introduce()).append(" I am a Student. I am at ").append(klass.getDisplayName()).append(".");
        return sb.toString();
    }
}
