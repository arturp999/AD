package MatrixUtils;

public class Calculadora {
    private double value;

    public Calculadora() {
        value = 0.0;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double newValue) {
        value = newValue;
    }

    public void clear() {
        value = 0.0;
    }

    public void add(double term) {
        value += term;
    }
}
