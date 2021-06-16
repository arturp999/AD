package Ficha6UMA;

public abstract class Shape {
   protected Point position;

   public Shape (){
       int position = 0;
   }

   public Shape( final Point position){
       this.position = position;
   }

    //GET
    public Point getPosition() {
        return position;
    }
    //SET
    public void setPosition(Point position) {
        this.position = position;
    }
    public abstract double getArea();
    public abstract double getPerimeter();


}
