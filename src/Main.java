import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static int doinitialPage(){
        int select;
        System.out.println("\n\t\t=======Welcome to CLI Facebook======\t");
        System.out.println("\t\t\t1.Log in\t");
        System.out.println("\t\t\t2.Register\t");
        System.out.println("\t\t\t3.Exit\t");
        System.out.println("Select option 1,2,3 to do your option?");
        select=scan.nextInt();
        return select;
    }

    public static void main(String[] args){

        while (true) {
            int option = doinitialPage();
            if (option == 1) {
                Login objLogin = new Login();
                objLogin.getInformation();
                if(objLogin.Verification()){
                   objLogin.initialLogin();
                }else{
                    System.out.println(" Try !");
                }

            } else if (option == 2) {
                Register objRegister = new Register();
                objRegister.getAndpushDetails();
            } else {
                System.out.println("\tGood Bye!....");
                break;
            }
        }
    }


}
