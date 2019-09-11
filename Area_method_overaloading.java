import java.util.Scanner;

public class Area {
    public static int area(int a) {
        return a * a;
    }

    public static int area(int l, int b) {
        return l * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side - ");
        int side = sc.nextInt();
        System.out.println("Area of square is - " + area(side));
        System.out.println("Enter length and breadth - ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        System.out.println("Area of rectangle is - " + area(length, breadth));
    }
}
