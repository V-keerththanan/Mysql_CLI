import java.util.Scanner;

public class Register {
    Scanner scan = new Scanner(System.in);
    private String NIC;
    private String Fname;
    private String Lname;
    private String Mobnum;
    private String passw;

    public void getAndpushDetails() {
        DBMS objdbms = new DBMS();
        System.out.println("\n Enter your NIC , this will be your user name?");
        this.NIC = scan.nextLine();
        System.out.println("\n Enter your FirstName?");
        this.Fname = scan.nextLine();
        System.out.println("\n Enter your LastName?");
        this.Lname = scan.nextLine();
        System.out.println("\n Enter your Mobilenumber?");
        this.Mobnum = scan.nextLine();
        System.out.println("\n Enter strong password for username?");
        this.passw = scan.nextLine();
        objdbms.insertData(this.NIC, this.Fname, this.Lname, this.Mobnum, this.passw);
        System.out.println("\n\t you have created your Account!..");
    }
}
