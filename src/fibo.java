import java.util.Scanner;

public class fibo {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x1 = 0;
        int x2 = 1;
        int temp = 0;
        for (int i = 1; i < n ; i++){
            temp = x1 + x2;
            x1 = x2;
            x2 = temp;
        }
        System.out.println(temp);
        sc.close();
    }
}
