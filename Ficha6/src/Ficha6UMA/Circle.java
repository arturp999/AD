package Ficha6UMA;

public class Circle extends Shape {
    private double radius;

    public Circle(final Point position,
                  final double radius) {
        this.position = position;
        this.radius = radius;
    }

    public Circle(){
        super();
    }

    public final double getRadius() {
        return radius;
    }

    @Override
    public Point getPosition() {
        return super.position;
    }

    @Override
    public double getArea() {

        return 0;
    }

    @Override
    public double getPerimeter() {

        return 0;
    }
}
