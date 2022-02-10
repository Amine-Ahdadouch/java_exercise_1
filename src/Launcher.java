import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Launcher{
    public static void fibo(int n){
        int x1 = 0;
        int x2 = 1;
        int temp = 0;
        for (int i = 1; i < n ; i++){
            temp = x1 + x2;
            x1 = x2;
            x2 = temp;
        }
        System.out.println(temp);
    }
    public static void read_fun(Scanner sc){
        System.out.println("Enter file name");
        try {
        Path path = Paths.get(sc.nextLine());
        String res = java.nio.file.Files.readString(path);
        String[] l1 = res.split("\\s+");
        for (int i = 0; i < l1.length; i++){

        }
            
        } catch (Exception e) {
            System.out.println("Unreadable file: " + e);
        }
    }
    public static void main(String[] args){
        System.out.println("bienvenue !");
        Scanner sc = new Scanner(System.in);
        String msg = "";
        Boolean cond_continue = true;
        while(cond_continue){
            System.out.println("Enter command name :");
            msg = sc.nextLine();
            if (msg.equals("quit")){
                cond_continue = false;
            }
            else if (msg.equals("fibo")){
                System.out.println("Enter a number");
                int n = sc.nextInt();
                Launcher.fibo(n);
            }
            else if (msg.equals("freq")){
                Launcher.read_fun(sc);
            }
            else{
                System.out.println("unknown command");
            }
        }
        sc.close();
    }
}