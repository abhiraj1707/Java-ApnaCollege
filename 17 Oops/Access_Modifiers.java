public class Access_Modifiers {
    public static void main(String args[]) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Abhiraj Singh";
        System.out.println(myAcc.username);
        myAcc.setPassword("ABCDEFGH");
        //System.out.println(myAcc.password);
    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}
