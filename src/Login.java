import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Login {
    DBMS objdbms = new DBMS();
    private String Enteredusername;
    private String Enteredpassword;
    private Map<String, String> Allidentification;
    private Map<String, ArrayList<String>> AllDetails;
    Scanner scan = new Scanner(System.in);

    public void getInformation() {
        System.out.println("\tHello! ");
        System.out.println("Enter your valid usernmame?");
        this.Enteredusername = scan.nextLine();
        System.out.println("Enter your valid password?");
        this.Enteredpassword = scan.nextLine();

    }

    public boolean Verification() {
        this.Allidentification = this.objdbms.getAllusernameAndpassword();
        if (this.Allidentification.containsKey(this.Enteredusername)) {

            if (this.Allidentification.get(this.Enteredusername).equals(this.Enteredpassword)) {
                return true;
            } else {
                System.out.println("\tThe password is wrong !");
                return false;
            }
        } else {
            System.out.println("\t You do not have any Account ! Try to create new Account!...");
            return false;

        }
    }
    public void initialLogin(){
        int select;
        while (true) {
            System.out.println("\t---Select option---");
            System.out.println("\t\t1.Profile");
            System.out.println("\t\t2.Friends");
            System.out.println("\t\t3.log out");
            select = scan.nextInt();
            if (select == 1) {
                    // have to implement
            } else if (select == 2) {
                    // have to implement
            } else {
                break;
            }
        }
    }
    public void printAlloneuserD() {
        this.AllDetails = this.objdbms.getAllDetails();
        String fname = this.AllDetails.get(this.Enteredusername).get(0);
        String lname = this.AllDetails.get(this.Enteredusername).get(1);
        String mobNum = this.AllDetails.get(this.Enteredusername).get(2);

        System.out.println("\t-------Welcome " + fname + " " + lname);
        System.out.println("You user Name is :- " + this.Enteredusername);
        System.out.println("Your Mobile Number is :- " + mobNum);

    }
}
