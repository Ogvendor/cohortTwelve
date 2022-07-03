package marvis;

import java.math.BigDecimal;

public class Bank {

    private String name;

    private String accountName;

    private int accountNumber;

    private int accountBalance;

    private String pin;

    public Bank() {
    }

    public Bank(String name, String accountName, int accountNumber, int accountBalance, String pin) {
        this.name = name;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.pin = pin;
    }

    public Bank(int accountBalance, String pin) {
        this.accountBalance = accountBalance;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int deposit(int amount){
        if (amount <= 0){
           throw new IllegalStateException("\"Amount cant be less than or equal to zero\"");
        }

        accountBalance += amount;
        return accountBalance;
    }

    public void withdraw(int amount){
        if (amount <= 0){
            throw new IllegalStateException("invalid input");
        }
        if (amount > accountBalance){
            throw new IllegalStateException("invalid input");
        }


        accountBalance -= amount;
    }
    public void transfer(int amount){
        if (amount > 0){
        }
        accountBalance -= amount;
    }

    @Override
    public String toString() {
        return "marvis.Bank{" +
                "name='" + name + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", pin='" + pin + '\'' +
                '}';
    }
}
