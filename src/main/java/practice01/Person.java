package practice01;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
       StringBuilder sb=new StringBuilder();
        sb.append("My name is ").append(name).append(".").append(" I am ").append(age).append(" years old.");
        return sb.toString();
    }
}
