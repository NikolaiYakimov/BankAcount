public class BankAcount {
    private int number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAcount(){

        this(12,1400.0,"Ivan","MyEmail@gmail.com","0886712999");
        System.out.println("Empty constructor!");
    }
    public BankAcount(int number, double balance, String customerName, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void depositFunds(double amount) {
        if(amount<400)
            System.out.println("You need to deposit at least 400 leva.");
        else {
            balance += amount;
            display();
        }
    }

    public void withdrawFunds(double amount) {
        if (balance < amount || amount<400) {
            System.out.println("Not enough money");
        } else {
            balance -= amount;
            display();
        }
    }

    public void display() {
        System.out.println("Id of client: " + getNumber());
        System.out.println("Name: " + getCustomerName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone number: " + getPhoneNumber());
    }
}
