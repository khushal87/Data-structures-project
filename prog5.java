import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);

            int t = input.nextInt();
            int n, root, sum, id;
    
            while(t-- != 0){
    
                n = input.nextInt();
                root = 0;
                for(int i = 0; i < n; i++){
                    id = input.nextInt();
                    sum = input.nextInt();
                    root += (id - sum);
                }
    
                System.out.println(root);
            }
        }
        catch(Exception e){
            return;
        }
    }
}