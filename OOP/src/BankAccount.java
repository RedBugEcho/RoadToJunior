class Bank{
    private double balance;

    public  Bank(double initialBalance){
        if (initialBalance > 0) this.balance = initialBalance;
        else this.balance = 0;

    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Your deposit: " + amount);
        }else System.out.println("Error. Your deposit must be higher than 0.");
    }

    public double getBalance(){
        return balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank myAccount = new Bank(1000);

        myAccount.deposit(500);

        System.out.println("Result: " + myAccount.getBalance());
    }
}