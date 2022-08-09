import java.util.Scanner;

public class Login {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        String Enteredusername;
        String Enteredpassword;
        System.out.println("\tHello! ");
        System.out.println("Enter your valid usernmame?");
        Enteredusername=scan.nextLine();
        System.out.println("Enter your valid password?");
        Enteredpassword=scan.nextLine();

    }
}
