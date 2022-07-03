package Mo;

public class Bank {

    private String name ;

    private String accountNumber;

    private double balance ;

    private String pin ;


    public Bank (){}


    public Bank (String name, String accountNumber, double balance, String pin) {


        this.name = name;

        this.accountNumber = accountNumber;

        this.balance = balance;

        this.pin = pin;


    }


    public Bank(String pin, double balance){

        this.pin = pin ;

        this.balance = balance;

    }


    public void setName(String name){

        this.name = name;

    }

    public String getName(){

        return name;

    }

    public void setPin (String pin) {

        this.pin = pin ;

    }


    public String getPin() {

        return pin;

    }



    public void setBalance (double balance) {

        this.balance = balance ;


    }


    public double getBalance () {

        return balance;

    }

    public void setAccountNumber (String accountNumber){

        this.accountNumber = accountNumber;
    }

    public String getAccountNumber () {

        return accountNumber;

    }









}
