import java.util.Scanner;

public class Login {
     private String Enteredusername;
     private String Enteredpassword;
    static Scanner scan=new Scanner(System.in);
    public void getInformation() {
        System.out.println("\tHello! ");
        System.out.println("Enter your valid usernmame?");
        this.Enteredusername=scan.nextLine();
        System.out.println("Enter your valid password?");
        this.Enteredpassword=scan.nextLine();

    }

   public void Verification(){
            // have to take username and password , check for verification
   }
}
