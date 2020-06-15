public class Client extends User {
    private static int COUNTER = 0;
    private int clientID;
    private BankAccount account;

    public Client(BankAccount account, String name, String surname) {
        super(name,surname);
        this.clientID = COUNTER++;
        this.account = account;
    }

    public void payIn(double amount) throws AccountOperationsException {
        this.account.makePayment(amount);
    }

    public void makeTransfer(double amount, BankAccount to) throws AccountOperationsException {
        this.account.makeTransfer(amount,to);
    }



//    public void assignAccount(BankAccount b){
//        this.b = b;
//    }

//    @Override
//    public String getName() {
//        return super.getName();
//    }
//
//    @Override
//    public void setName(String name) {
//        super.setName(name);
//    }
//
//    @Override
//    public String getSurname() {
//        return super.getSurname();
//    }
//
//    @Override
//    public void setSurname(String surname) {
//        super.setSurname(surname);
//    }
}
