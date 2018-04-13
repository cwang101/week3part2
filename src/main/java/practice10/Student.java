package practice10;

public class Student extends Person{
    Klass klass;

    public Student(int id,String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
        klass.appendMember(this);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        StringBuilder sb=new StringBuilder();
        sb.append(super.introduce()).append(" I am a Student. ");
        if(klass.getLeader()!=null&&id==klass.getLeader().id){
            sb.append("I am Leader of ");
        }else {
            sb.append("I am at ");
        }
        sb.append(klass.getDisplayName()).append(".");
        return sb.toString();
    }
}
