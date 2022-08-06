// Name :- Makhansa Jenil
// Roll-no :-21ce065
// • A private double data field named balance for the account (default 500₹).
// • A private double data field named annualInterestRate that stores the current
// interest rate (default 7%). Assume all accounts have the same interest rate.
// • A private Date data field named dateCreated that stores the date when the
// account was created.
// • A no-arg constructor that creates a default account.
// • A constructor that creates an account with the specified id and initial balance.
// • The accessor and mutator methods for id, balance, and annualInterestRate.
// • The accessor method for dateCreated.
// • A method named getMonthlyInterestRate() that returns the monthly interest rate.
// • A method named getMonthlyInterest() that returns the monthly interest.
// • A method named withdraw that withdraws a specified amount from the account.
// • A method named deposit that deposits a specified amount to the account.
// Aim :-Design a class named Account that contains:
// • A private int data field named id for the account (default 0).
import java.util.Date;
 class Account {
            private int id;
            private double balance;
            private double annualInterestRate;
            private Date dateCreated;

        //Default Constructor.
        public Account() {
                id = 0;
                balance = 500;
                annualInterestRate = 7;
                dateCreated = new Date();
                }

        //Parameterized constructor.
        public Account(int id, double balance) {
                this.id = id;
                this.balance = balance;
                dateCreated = new Date();
                }

        // Accessor and mutators....
        public int getId() {
                return id;
                }

        public void setId(int id) {
                this.id = id;
                }

        public double getBalance() {
                return balance;
                }

        public void setBalance(double balance) {
                this.balance = balance;
                }

        public double getAnnualInterestRate() {
                return annualInterestRate;
                }

        public void setAnnualInterestRate(double annualInterestRate) {
                this.annualInterestRate = annualInterestRate;
                }

        public Date getDateCreated() {
                return dateCreated;
                }

        //Method to return Interest rate and interest.
        public double getMonthlyInterestRate() {
                return annualInterestRate / 12;
                }

        public double getMonthlyInterest() {
                return balance * annualInterestRate / 1200;
                }

        //method to withdraw amount from account.
        public void withdraw(double amount) {
                balance -= amount;
                System.out.println(amount + " Rs. Withdrawn successfully.");
                }

        //method to deposit the amount.
        public void deposit(double amount) {
                balance += amount;
                System.out.println(amount + " Rs. Deposited successfully.");
                }

        @Override
        public String toString() {
                return "Account Details :\n" +
                "Id = " + id +"\n"+
                "Balance = " + balance + "\n"+
                "Annual Interest Rate = " + annualInterestRate +"\n"+
                "Date of creation = " + dateCreated;
                }
        }