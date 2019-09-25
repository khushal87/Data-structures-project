import java.util.Scanner;

public class StudentString {
    private int reg_no;
    private String name;
    private String date_joining;
    private int semester;
    private double gpa;
    private double cgpa;

    public int reg_no_calculator(int number) {
        String temp = "";
        for (int i = 8; i <= 9; i++) {
            temp += (this.date_joining.charAt(i));
        }
        temp += number;
        int res = Integer.parseInt(temp);
        return res;
    }

    public StudentString() {
        this.reg_no = 0;
        this.name = "Unknown";
        this.date_joining = "00-00-0000";
        this.semester = 0;
        this.gpa = 0.00;
        this.cgpa = 0.00;
    }

    public StudentString(int reg_no, String name,int semester, double gpa, double cgpa) {
        this.reg_no = reg_no;
        this.name = name;
        this.semester = semester;
        this.gpa = gpa;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("Registration number - " + this.reg_no);
        System.out.println("Name - " + this.name);
        System.out.println("Date of joining - " + this.date_joining);
        System.out.println("Semester - " + this.semester);
        System.out.println("Gpa - " + this.gpa);
        System.out.println("Cgpa - " + this.cgpa);
        System.out.println("-----------------------------------------");
    }

    public void input_display(StudentString s,int number) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter data of the student");
            s.reg_no = reg_no_calculator(number);
            //sc.nextLine();
            s.name = sc.nextLine();
            s.date_joining = sc.nextLine();
            s.semester = sc.nextInt();
            s.gpa = sc.nextDouble();
            s.cgpa = sc.nextDouble();
            display();
            System.out.println("-----------------------------------------");
    }

    void sort_semester(StudentString arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i].semester > arr[j].semester) {
                    StudentString temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void sort_cgpa(StudentString arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i].cgpa > arr[j].cgpa) {
                    StudentString temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void sort_name(StudentString arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if ((arr[i].name.compareTo(arr[j].name)) > 0) {
                    StudentString temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void displayChar(char ch, StudentString arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i].name.charAt(0) == ch) {
                display();
            }
        }
    }
}

class StudentStringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students - ");
        int length = sc.nextInt();
        sc.nextLine();
        StudentString s[] = new StudentString[length];
        for(int i=0;i<length;i++)
        {
            s[i]=new StudentString();
            s[i].input_display(s[i],i+10);
        }
        System.out.println("Sorted by semester");
        s[0].sort_semester(s);
        for (int i = 0; i < length; i++) {
            s[i].display();
        }

        System.out.println("Sorted by cgpa");
        s[0].sort_cgpa(s);
        for (int i = 0; i < length; i++) {
            s[i].display();
        }

        System.out.println("Sorted by name");
        s[0].sort_name(s);
        for (int i = 0; i < length; i++) {
            s[i].display();
        }

        System.out.println("All students with particular letter.Enter Character - ");
        char ch = sc.next().charAt(0);
        s[0].displayChar(ch, s);
    }
}
