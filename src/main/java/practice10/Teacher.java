package practice10;

import java.util.HashSet;
import java.util.Set;

public class Teacher extends Person{

    Set<Klass> classes=new HashSet<>();
    public Teacher(int id,String name, int age, Set<Klass> classes) {
        super(id,name, age);
        this.classes = classes;
    }

    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }

    public Set<Klass> getClasses() {
        return classes;
    }

    public String introduce(){
        StringBuilder sb=new StringBuilder();
        sb.append(super.introduce()).append(" I am a Teacher. I teach ");
        if(classes.size()>0){
            sb.append(getClassDisplay()).append(".");
        }else{
            sb.append("No Class.");
        }

        return sb.toString();
    }

    public boolean isTeaching(Student student){
        for(Klass klass:classes){
            if(klass.isIn(student)){
                return true;
            }
        }
        return false;
    }
    public String introduceWith(Student student){
        StringBuilder sb=new StringBuilder();
        if(isTeaching(student)){
            sb.append(super.introduce()).append(" I am a Teacher. I teach ").append(student.getName()).append(".");
        }else {
            sb.append(super.introduce()).append(" I am a Teacher. I don't teach ").append(student.getName()).append(".");

        }
        return sb.toString();
    }

    private String getClassDisplay(){
        StringBuilder sb=new StringBuilder();
        sb.append("Class ");
        int index=0;
        for(Klass klass:classes){
            sb.append(klass.getNumber());
            if(index<classes.size()-1){
                sb.append(", ");
            }
            index++;
        }
        return sb.toString();
    }
}
