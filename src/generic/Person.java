package generic;

public class Person implements Comparable<Person>{
    private int intIQ;
    private String name;

    public Person(int intIQ, String name) {
        this.intIQ = intIQ;
        this.name = name;
    }

    public int getIntIQ() {
        return intIQ;
    }

    public void setIntIQ(int intIQ) {
        this.intIQ = intIQ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        if (this.getIntIQ() > o.getIntIQ()) return 1;
        else if (this.getIntIQ() < o.getIntIQ()) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "intIQ=" + intIQ +
                ", name='" + name + '\'' +
                '}';
    }
}
