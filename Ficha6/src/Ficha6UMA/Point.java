package Ficha6UMA;

public class Point {
    // a. Adicione os atributos x e y do tipo double
    private double x;
    private double y;

    public Point(){
        x = 0;
        y = 0;
    }

    // Construtor com parametros
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //GETTER X e Y
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setBothYX(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double distanceTo(Point other){
        double distance = Math.sqrt(Math.pow(other.x-this.x,2)+Math.pow(other.y-this.y,2));;
        return distance;
    }


}
