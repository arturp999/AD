package polimorfismo;

public class Supervisor extends Employee {
    private int level;

    public Supervisor(final String name,final String snn, final int level ){

    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "(" + getName() + ", "+ getSsn() + ", " + getLevel() + ")";
    }
}
