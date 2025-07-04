package practice01.practice_02;

public class BankAccount {

/*    Поля:
    String owner (владелец счёта),
    double balance (баланс).
    Реализуйте:
    Конструктор, принимающий owner и balance.
    Геттеры для получения данных.
    Сеттер для изменения владельца.
    Метод deposit(double amount) — увеличивает баланс на amount.
    Метод withdraw(double amount) — уменьшает баланс на amount.
    Метод printBalance() для вывода текущего баланса.
    В методе main создайте банковский счёт, внесите депозит, снимите деньги и выведите текущий баланс.*/

    String owner;
    double balance;
    
    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }
    
    void setOwner(String newOwner) {
        this.owner = newOwner;
    }
    
    void deposit(double amount) {
        this.balance = getBalance() + amount;
    }

    void withdraw(double amount) {
        this.balance = getBalance() - amount;
    }

    void printBalance() {
        System.out.println("Current balance: " + getBalance());
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("A",10_000);
        bankAccount.deposit(5_000);
        bankAccount.withdraw(1_000);
        bankAccount.printBalance();
    }
}
