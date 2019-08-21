
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
        c2.inputA(3.0);
        c1.inputB(-4.0);
        c2.inputB(-5.0);
        complexnumber ans=new complexnumber();
        ans.addComplexA(c1, c2);
        if(ans.getB()>=0)
            System.out.println(ans.getA()+"+"+ans.getB()+"i");
        else
            System.out.println(ans.getA()+" "+ans.getB()+"i");
        ans.subsComplexB(c1, c2);
        System.out.println(ans.getA()+"+"+ans.getB()+"i");
    }
}
