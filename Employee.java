import java.util.ArrayList;
import java.util.UUID;

public class Employee extends User {
    private static int COUNTER = 0;
    int employeeID;
//    boolean isAnEmployee;
    ArrayList <Client> clients = new ArrayList<>();

    public Employee( String name, String surname) {
        super(name, surname);
        this.employeeID = COUNTER++;

    }

//    public void setEmployee(boolean isAnEmployee) {
//        this.isAnEmployee = isAnEmployee;
//    }


    public Client addClient( String name, String surname, double accountBalance){
        BankAccount b = new BankAccount(accountBalance,null);
        Client c = new Client( b, name, surname);
        return c;
    }

    public void acceptPayment(double payment, BankAccount account) throws AccountOperationsException {
        account.makePayment(payment);
    }

    public void acceptPayment(double payment, BankAccount from, BankAccount to) throws AccountOperationsException {
        from.makeTransfer(payment,to);
    }

//    public void acceptPayment(double payment, BankAccount account){
//        Transaction t = new Transaction(payment,null, account);
//        account.getListOfTransactions().add(t);
//        account.setAccountBalance(account.getAccountBalance()-payment);
//    }


//    public BankAccount openBankAccount(){
//        return null;
//    }



//
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
