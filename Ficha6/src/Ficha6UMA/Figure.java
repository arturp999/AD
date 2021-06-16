package Ficha6UMA;

import java.util.ArrayList;

public class Figure {
    private ArrayList<Shape> shapes;

    public Figure(){
        this.shapes = new ArrayList<Shape>();
    }

    public Figure(ArrayList<Shape> shapes){
        this.shapes = shapes;
    }
    //get
    public ArrayList<Shape> getShapes() {
        return shapes;
    }
    //set
    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }
    public void add(Shape shape){
        this.shapes.add(shape);
    }
}
