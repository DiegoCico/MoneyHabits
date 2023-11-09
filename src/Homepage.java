import java.util.Scanner;

public class Homepage {

    public static int home(StoreInfo st){
        Scanner in = new Scanner(System.in);
        double expenses = 0;
        double total = st.getAccount().getIncome();
        double inp = 0;
        System.out.println("Name: " + st.getAccount().getName() + "     Income: " + st.getAccount().getIncome() + "        Student Acc: " + st.getAccount().isStudent());
        System.out.println("Job: " + st.getAccount().getJob());
        System.out.println();
        System.out.println("Write all your expenses you need to pay, write -1 once you are done");
        while(inp != -1){
            inp = in.nextDouble();
            expenses += inp;
            return -1;
        }
        expenses++;
        total -= expenses;
        if(total <= 0){
            System.out.println("Sorry you went to the negatives, it was nice having an account with you");
            System.out.println("Your account will be deleted");

        }
        System.out.println("How much percent would you like to put it in your savings");
        double saving = in.nextDouble();
        saving = (saving/100) + 1;
        total /= saving;
        double totalRounded = Math.round(total * 100.0) / 100.0;
        System.out.println("After all your expenses your total is $" + totalRounded);

        return (int)totalRounded;
    }
}
