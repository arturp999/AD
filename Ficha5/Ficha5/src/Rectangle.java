public class Rectangle {
    private double width;
    private Point topLeftPoint;
    private double height;

    public Rectangle(Point topLeftPoint, double width, double height){
        this.topLeftPoint = topLeftPoint;
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){
        return this.width * this.height;
    }
    
    public double getPerimeter(){
        return (width * 2) + (height * 2);
    }

    public boolean contains(Point p){
        Point bottomLeft = new Point(topLeftPoint.getX(), topLeftPoint.getY() - height);
        Point topRight = new Point(topLeftPoint.getX() + width, topLeftPoint.getY());
        Point bottomRight = new Point(topLeftPoint.getX() + width, topLeftPoint.getY() - height);
        if (p.getX() > bottomLeft.getX() && p.getX() < bottomRight.getX() && p.getY() >bottomLeft.getY() && p.getY() < topRight.getY()){
            return true;
        }
        else {
            return false;
        }
    }
    
    
}
