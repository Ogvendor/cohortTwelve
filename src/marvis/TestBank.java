package marvis;

public class TestBank {

    public static void main(String[] args) {


        Bank zenith = new Bank("Zenith", "John Doe", 9393939, 1000, "0000");

        Bank polaris = new Bank( 0, "0000");

        polaris.setAccountName("Marvis Doe");

        polaris.deposit(500000);

        polaris.withdraw(430000);
        polaris.transfer( 50000);

        System.out.println(zenith.toString());

        System.out.println();

        System.out.println(polaris.toString());

    }
}
