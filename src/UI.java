import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UI {
    static ArrayList<StoreInfo> st = new ArrayList<>();
    public static void menu(){
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";

        int id = -1;
        Scanner in = new Scanner(System.in);

        System.out.println("1. Create Account");
        System.out.println("2. Log In");
        System.out.println(st);

        int c = in.nextInt();
        if(c==1){
            st.add(createAccount());
            menu();
        } else if (c==2){
            id = logIn();
            if(id == -1){
                System.out.println(RED+"I am sorry password or user incorrect!"+RESET);
                menu();
            }
            System.out.println(GREEN+"Welcome " + st.get(id).getAccount().getName()+RESET);

        }
    }

    public static int logIn() {
        Scanner in = new Scanner(System.in);
        System.out.println("Username");
        String user = in.next();
        System.out.println("Password");
        String password = in.next();
        for(int i = 0; i<st.size();i++){
            if(st.get(0).getSignup().getUser().equals(user) && st.get(0).getSignup().getPass().equals(password))
                return i;
        }
        return -1;
    }

    public static StoreInfo createAccount() {
        Scanner in = new Scanner(System.in);
        System.out.println("Full Name");
        String name = in.nextLine();
        System.out.println("Age");
        int age = in.nextInt();
        System.out.println("Occupation");
        String job = in.next();
        System.out.println("Income");
        int income = in.nextInt();
        System.out.println("Are you a student");
        String studentString = in.next();
        boolean student = false;

        if(studentString.contains("y"))
            student = true;

        System.out.println("Username");
        String user = in.next();
        System.out.println("Password");
        String pass = in.next();
        Account a = new Account(name, age, job, income, student);
        SignUp s = new SignUp(user, pass);

        System.out.println("Sucesfully added!");
        return new StoreInfo(a,s);
    }

}
