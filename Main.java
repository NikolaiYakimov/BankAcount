public class Main {
    public static void main(String[] args) {

        BankAcount bankAcount=new BankAcount(1,1500.0,"Georgi","georgi@gmail.com","0887569328");

        bankAcount.display();
        System.out.println();
        bankAcount.depositFunds(1);
        System.out.println("");
        bankAcount.withdrawFunds(1500);
        System.out.println();

    }
}