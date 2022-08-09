import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static int doLoginPage(){
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
        int option= doLoginPage();
    }


}
