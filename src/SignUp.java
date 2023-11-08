public class SignUp {
    private String user;
    private String pass;

    public SignUp(String u, String p){
        user = u;
        pass = p;
    }

    public void changePass(String p){
        pass = p;
    }

    public String getUser(){
        return user;
    }

    public String getPass(){
        return pass;
    }

}
