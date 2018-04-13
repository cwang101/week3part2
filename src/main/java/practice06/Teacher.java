package practice06;

public class Teacher extends Person{
    int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }
    public int getKlass() {
        return klass;
    }
    public String introduce(){
        StringBuilder sb=new StringBuilder();
        if(klass>0){
            sb.append(super.introduce()).append(" I am a Teacher. I teach Class ").append(klass).append(".");
        }else{
            sb.append(super.introduce()).append(" I am a Teacher. I teach No Class.");
        }

        return sb.toString();
    }
}
