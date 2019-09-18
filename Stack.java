class Stack {
    int[] arr;
    int top;
    static int Max = 100;

    Stack() {
        arr=new int[Max];
        top = -1;
    }

    void push(int val) {
        if (top == Max - 1) {
            System.out.println("Stack overflow");
        } else {
            arr[++top] = val;
        }
    }


    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            int x = arr[top--];
            return x;
        }
    }

    boolean isEmpty() {
        return top < 0;
    }

    void display() {
        while (!isEmpty()) {
            System.out.println(arr[top] + "\t");
            top--;
        }
    }

    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.pop();
        s1.display();
    }
}
