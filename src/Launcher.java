import java.util.Scanner;
public class Launcher{
    public static void main(String[] args){
        System.out.println("Bienvenue");
        Scanner scanner = new Scanner(System.in);
        String msg = "";
        while (!msg.equals("quit")){
            msg = scanner.nextLine();
            System.out.println("Unknown command");
        }
    }
}