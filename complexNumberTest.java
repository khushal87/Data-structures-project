
class complexnumber {

    private double real;
    private double img;

    void inputA(double a1) {
        real = a1;
    }

    void inputB(double b1) {
        img = b1;
    }

    double getA() {
        return real;
    }

    double getB() {
        return img;
    }

    void addComplexA(complexnumber a, complexnumber b) {
        real = a.real + b.real;
        img = a.img + b.img;
    }

    void subsComplexB(complexnumber a,complexnumber b) {
        real=a.real-b.real;
        img=a.img-b.img;
    }
}

public class complexNumberTest {

    public static void main(String args[]) {
        complexnumber c1 = new complexnumber();
        complexnumber c2 = new complexnumber();
        c1.inputA(2.0);
        double a1 = c1.getA();
        c2.inputA(3.0);
        double a2 = c2.getA();
        c1.inputB(-4.0);
        double b1 = c1.getB();
        c2.inputB(-5.0);
        double b2=c2.getB();
        complexnumber ans=new complexnumber();
        ans.addComplexA(c1, c2);
        System.out.println(ans.getA()+" "+ans.getB());
        ans.subsComplexB(c1, c2);
        System.out.println(ans.getA()+" "+ans.getB());
    }
}
