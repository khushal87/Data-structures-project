import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not Available";
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        Student arr[] = new Student[10];
        Scanner sc = new Scanner(System.in);
        for (int student = 1; student <= 10; student++) {
            arr[student - 1] = new Student();
            System.out.println("Enter option 1 for 2 inputs and 2 for 3 inputs- ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Enter name and age - ");
                    String name = sc.nextLine();
                    int age = sc.nextInt();
                    sc.nextLine();
                    arr[student - 1].setInfo(name, age);
                    break;
                case 2: {
                    System.out.println("Enter name and age and address - ");
                    String name1 = sc.nextLine();
                    int age1 = sc.nextInt();
                    sc.nextLine();
                    String address1 = sc.nextLine();
                    arr[student - 1].setInfo(name1, age1, address1);
                    break;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Student info");
            System.out.println("Name - " + arr[i].name);
            System.out.println("Age - " + arr[i].age);
            System.out.println("Address - " + arr[i].address);
        }
    }
}

