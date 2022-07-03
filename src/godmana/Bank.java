package godmana;

public class Bank {


    private String name;
    private String accountName;
    private double balance;
    private String pin;


    public Bank(){

    }

    public Bank (String pin, double balance){
        this.pin = pin;
        this.balance = balance;
    }

    public Bank(String name, String accountName, double balance, String pin) {
        this.name = name;
        this.accountName = accountName;
        this.balance = balance;
        this.pin = pin;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccountName(String AccountName){
            this.accountName = accountName;
 }

    public String getAccountName(){
        return name;
    }

    public void setBalance( double balance){
     this.balance = balance;
   }

     public double getBalance() {
         return balance;
     }

     public void setPin(String pin){
        this.pin = pin;
     }

     public String getPin (){
        return pin;
     }






}
