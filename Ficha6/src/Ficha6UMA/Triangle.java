package Ficha6UMA;

public class Triangle extends Shape{
    //a. Adicione os atributos a, b e c tipo Point
    private Point a;
    private Point b;
    private Point c;

    // Construtor com parametros
    public Triangle(Point a, Point b,Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //Construtor por omissao
    public Triangle() {
        a = new Point();
        b = new Point();
        c = new Point();
    }

    //GETTERS
    public Point getPointA(){
        return this.a;
    }
    public Point getPointB(){
        return this.b;
    }
    public Point getPointC(){
        return this.c;
    }

    //c. Seletores/propriedades para aceder aos atributos
    //SETTERS
    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public double getWidth(){
        double distance = a.distanceTo(c);
        return distance;
    }

    public double getHeight(){
        double distance = a.distanceTo(b);
        return distance;
    }

    public double getArea(){
        double area = (getWidth()*getHeight())/2;
        return area;
    }


}
