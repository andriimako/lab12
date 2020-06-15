import java.lang.Math.*;
public class Transaction {

    private static int COUNTER = 0;
    private int transactionID;
    private double transactionValue;
    private BankAccount from;
    private BankAccount to;

    public Transaction(double transactionValue, BankAccount from, BankAccount to) {
        this.transactionID = COUNTER++;
        this.transactionValue = transactionValue;
        this.from = from;
        this.to = to;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public double getTransactionValue() {
        return transactionValue;
    }

    public BankAccount getFrom() {
        return from;
    }

    public BankAccount getTo() {
        return to;
    }

//    public void setTransactionValue(double transactionValue) {
//        this.transactionValue = transactionValue;
//    }
//
//    public void setFrom(BankAccount from) {
//        this.from = from;
//    }
//
//    public void setTo(BankAccount to) {
//        this.to = to;
//    }
}
