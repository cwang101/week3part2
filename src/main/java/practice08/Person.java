package practice08;

import java.util.Objects;

public class Person {
    String name;
    int age;
    int id;

    public Person(int id,String name, int age) {
        this.name = name;
        this.age = age;
        this.id=id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, id);
    }
}
