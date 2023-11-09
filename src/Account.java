public class Account {
    private String name;

    private int age;
    private String job;
    private int income;
    private boolean student;

    private int id;

    public Account(String n, int a, String j, int i, boolean s){
        name = n;
        age = a;
        job = j;
        income = i;
        student = s;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getJob(){
        return job;
    }

    public int getIncome(){
        return income;
    }

    public boolean isStudent(){
        return student;
    }
}
