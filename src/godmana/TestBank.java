package godmana;

public class TestBank{

   public static void main (String[] args) {
       Bank ajebo = new Bank();

       Bank stunna = new Bank("0012", 0.0);

       Bank hadiza = new Bank("Hadiza", "01303", 100.0, "0012");


       ajebo.setName("Jennifer");
       ajebo.setAccountName("01303");
       ajebo.setBalance(100.0);
       ajebo.setPin("0012");

       System.out.print(ajebo.getName());

       System.out.println(ajebo.getAccountName());

       System.out.println(ajebo.getBalance());

       System.out.println(ajebo.getPin());
   }


}
