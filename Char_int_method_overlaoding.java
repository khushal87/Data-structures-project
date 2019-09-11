import java.util.Scanner;

public class IntChar {
    public static void print(int n, char c) {
        System.out.println("Interger - " + n + " Character - " + c);
    }

    public static void print(char c, int n) {
        System.out.println("Character - " + c + " Integer - " + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print('a', 4);
        print(4, 'a');
    }
}
