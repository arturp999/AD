package Ficha6UMA;

public class Main {
    public static void main(String[] args) {

        Car carro = new Car(2010, "BMW", "320d", 30, "Blue");
        //System.out.println(carro.getPrice() + " ," + carro.getYear() + " ," + carro.getBrand()+ " ,"+ carro.getModel() + " ," + carro.getColor());
        //System.out.println(carro.toString());

        Motorcycle mota = new Motorcycle(2000, "Aprilia", "SVR", 18500, "Red and Black");
        //System.out.println(mota.getPrice() + " ," + mota.getYear() + " ," + mota.getBrand()+ " ,"+ mota.getModel() + " ," + mota.getColor());
        //System.out.println(mota.toString());

        Shape circle = new Circle(new Point(0, 0) ,5);
        Shape rt = new Rectangle(new Point(0, 5),5, 5);
        Shape t = new Triangle(new Point(0, 5),b, b);
        Figure fig = new Figure();
        fig.add(circle);
        fig.add(rt);
        fig.add(t);

        for (int i = 0; i < fig.getShapes().size(); i++) {
            Shape s = fig.getShapes().get(i);
            s.getArea();
            s.getPerimeter();
        }


    }
}