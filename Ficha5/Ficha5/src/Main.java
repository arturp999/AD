import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

    public class Main {
        public static void main(String[] args) {

            Point xTeste = new Point();
            //xTeste.setX(5);
            //System.out.println(xTeste.getX());

            Point yTeste = new Point();
            ////yTeste.setY(5);
            //System.out.println(yTeste.getY());

            Point bothYX = new Point();
            ////bothYX.setBothYX(15,20);
            //System.out.println(bothYX.getY());
            //System.out.println(bothYX.getX());

            Point a = new Point(0,0);
            Point b = new Point(0,3);
            Point c = new Point(3,0);
            //System.out.println(a.distanceTo(b));

            Triangle t = new Triangle(a,b,c);
            //System.out.println(c.getA(a));
            //System.out.println(t.getWidth());
            //System.out.println(t.getHeight());
            //System.out.println(t.getArea());

            Rectangle rt = new Rectangle(new Point(0,5),5,5);
            Point f = new Point(1,1);
            Point ff = new Point(10,10);
            System.out.println(rt.contains(ff));
        }}
