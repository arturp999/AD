package polimorfismo;

public class Object extends Employee {
    private String name;
    private String ssn;

    public  Employee(final String name, final String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "(" + getName() + ", " + getSsn() + ")";
    }


}
