public class Main {
    public static void main(String[] args) {

        //BankAcount bankAcount=new BankAcount(1,1500.0,"Georgi","georgi@gmail.com","0887569328");
        BankAcount bankAcount=new BankAcount();

        bankAcount.display();
        System.out.println();
        bankAcount.depositFunds(600);
        System.out.println("");
        bankAcount.withdrawFunds(1500);
        System.out.println();

        BankAcount myAcount=new BankAcount("Nikolay" ,"myemail@gmail.com","0876594788");
        myAcount.display();

    }
}