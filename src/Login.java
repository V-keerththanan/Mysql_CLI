import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Login {

    private String Enteredusername;
    private String Enteredpassword;
    private Map<String, String> Allidentification;
    Scanner scan = new Scanner(System.in);

    public void getInformation() {
        System.out.println("\tHello! ");
        System.out.println("Enter your valid usernmame?");
        this.Enteredusername = scan.nextLine();
        System.out.println("Enter your valid password?");
        this.Enteredpassword = scan.nextLine();

    }

    public boolean Verification() {
        DBMS objdbms = new DBMS();
        this.Allidentification = objdbms.getAllusernameAndpassword();
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
            System.out.println("\t\t2.More Active user");
            System.out.println("\t\t3.log out");
            select = scan.nextInt();
            if (select == 1) {
                    printAlloneuserD();
            } else if (select == 2) {
                   printAlluser();
            } else {
                break;
            }
        }
    }
    public void printAlloneuserD() {
        DBMS objdbms = new DBMS();
        String fname = objdbms.getAllDetails().get(this.Enteredusername).get(0);
        String lname = objdbms.getAllDetails().get(this.Enteredusername).get(1);
        String mobNum = objdbms.getAllDetails().get(this.Enteredusername).get(2);

        System.out.println("\t-------Welcome " + fname + " " + lname);
        System.out.println("You user Name is :- " + this.Enteredusername);
        System.out.println("Your Mobile Number is :- " + mobNum);

    }
    public void printAlluser(){
        DBMS objdbms = new DBMS();
        int i=1;
        for( Map.Entry<String, ArrayList<String> > entry : objdbms.getAllDetails().entrySet() ){
            if (entry.getKey().equals(this.Enteredusername)){
                continue;
            }else {
                System.out.println("---------" + i + "----------");
                System.out.println("First name" + "=> " + entry.getValue().get(0));
                System.out.println("Last name" + "=> " + entry.getValue().get(1));
                System.out.println("Mobile Number" + "=> " + entry.getValue().get(2));
                i++;
            }
        }
    }
}
