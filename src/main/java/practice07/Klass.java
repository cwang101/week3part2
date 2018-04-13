package practice07;

public class Klass {
    int number;

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
}
