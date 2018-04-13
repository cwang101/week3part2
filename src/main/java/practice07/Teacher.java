package practice07;

public class Teacher extends Person{
    Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        StringBuilder sb=new StringBuilder();
        if(klass!=null){
            sb.append(super.introduce()).append(" I am a Teacher. I teach ").append(klass.getDisplayName()).append(".");
        }else{
            sb.append(super.introduce()).append(" I am a Teacher. I teach No Class.");
        }

        return sb.toString();
    }

    public String introduceWith(Student student){
        StringBuilder sb=new StringBuilder();
        if(klass!=null&&klass.getNumber()==student.getKlass().getNumber()){
            sb.append(super.introduce()).append(" I am a Teacher. I teach ").append(student.getName()).append(".");
        }else {
            sb.append(super.introduce()).append(" I am a Teacher. I don't teach ").append(student.getName()).append(".");

        }
        return sb.toString();
    }
}
