package Mo;

public class BankTest {


    public static void main (String[] args) {


        Bank ajebo = new Bank() ;



        Bank stunner = new Bank ("0147", 0.0 ) ;


        Bank hadiza = new Bank ("Hadiza", "0147777", 100.0 , "0000");


        ajebo.setName ("Mojiza");
        ajebo.setAccountNumber ("0148942");
        ajebo.setBalance (100.0);
        ajebo.setPin ("0001");

        System.out.println (ajebo.getName());

        System.out.println ();

        System.out.println (ajebo.getAccountNumber());

        System.out.println ();

        System.out.println (ajebo.getBalance());

        System.out.println ();

        System.out.println (ajebo.getPin());

        System.out.println ();


    }


}