//By KHUHSAL AGARWAL
class Point {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    void equality(Point p1,Point p2)
    {
        if(p1.x==p2.x && p1.y==p2.y)
        {
            System.out.println("Equal Points.");
        }
        else
        {
            System.out.println("Not Equal Points.");
        }
    }

    double distance(Point p1,Point p2)
    {
        double dis=Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p2.y-p1.y)*(p2.y-p1.y));
        return dis;
    }

    void display(Point p1,Point p2)
    {
        System.out.println("Point 1 :- ");
        System.out.println("x= "+p1.getX()+" y= "+p1.getY());
        System.out.println("Point 2 :- ");
        System.out.println("x= "+p2.getX()+" y= "+p2.getY());
        p1.equality(p1,p2);
        System.out.println(p1.distance(p1,p2));
    }
}

class pointTest {
    public static void main(String[] args) {
        Point p1=new Point();
        p1.setX(3.4);
        p1.setY(5.6);
        Point p2=new Point();
        p2.setX(13.4);
        p2.setY(15.6);
        p1.display(p1,p2);
        p2.distance(p1,p2);
    }
}
