public class StoreInfo {
    private Account a;
    private SignUp l;

    public StoreInfo(){
    }
    public StoreInfo(Account ac, SignUp sl){
        a = ac;
        l = sl;
    }

    public SignUp getSignup(){
        return l;
    }

    public Account getAccount(){
        return a;
    }

}
