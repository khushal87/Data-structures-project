// created by akashbhalotia
import java.util.*;
class Matrix //matrix class
{
    private int M[][]; //array to store the matrix 
    private final int R,C; //dimensions

    public Matrix(int R, int C) //parameterized constructor
    {
        this.R=R;
        this.C=C;
        M=new int[R][C];
    }
    public void input() //taking input from user
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.println("Enter a number");
                M[i][j]=sc.nextInt();
            }
        }
        System.out.println();
    }
    public void product(Matrix A, Matrix B) //computing the product
    {
        int i,j,k;

        for(i=0;i<A.R;i++)
            for(j=0;j<B.C;j++)
                for(k=0;k<A.C;k++)
                    M[i][j]+=A.M[i][k]*B.M[k][j];
    }
    public void display() //display this matrix
    {
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
                System.out.print(M[i][j]+" ");
            System.out.println();
        }
        System.out.println();
    }
}
class Dimensions //dimensions class
{
    private final int R,C;
    public Dimensions(int R, int C)
    {
        this.R=R;
        this.C=C;
    }
    public boolean isCompatible(Dimensions D) //checks compatibility
    {
        return (this.R>0&&this.C>0&&D.R>0&&D.C>0&&this.C==D.R);
    }
}
class Driver
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter dimensions of matrix A");
        int R1=sc.nextInt();
        int C1=sc.nextInt();

        System.out.println("Enter dimensions of matrix B");
        int R2=sc.nextInt();
        int C2=sc.nextInt();

        Dimensions d1=new Dimensions(R1,C1);
        Dimensions d2=new Dimensions(R2,C2);

        if(!d1.isCompatible(d2))
            System.out.println("Can't multiply");
        else
        {
            Matrix A=new Matrix(R1,C1);
            System.out.println("Matrix A:");
            A.input();

            Matrix B=new Matrix(R1,C1);
            System.out.println("Matrix B:");
            B.input();

            System.out.println("Matrix A:");
            A.display();
            System.out.println("Matrix B:");
            B.display();

            Matrix C=new Matrix(R1,C2);
            C.product(A,B);
            System.out.println("Product: ");
            C.display();
        }
    }
}
