package arqdesp;

import java.util.Objects;

public class Rational implements Comparable<Rational> {
    private int numerator;
    private int denominator;

    public Rational(int denominator, int numerator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rational rational = (Rational) o;
        return numerator == rational.numerator &&
                denominator == rational.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    public int compareTo(final Rational another) {
        return getNumerator() * another.getDenominator()
                - this.getNumerator() * getDenominator();
    }


    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
