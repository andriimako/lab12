public class Main {

    public static void main(String[] args) throws AccountOperationsException {

        Administrator admin = new Administrator("Андрюха","АДМИН");
        Employee loh = new Employee("LOL","kek");
        Employee loh2 = new Employee("LOL","kek");

        Client loh3 = new Client(new BankAccount(123.00,null),"adad","asdas");
        Client loh4 = new Client(new BankAccount(123.00,null),"adad","asdas");
        Client loh5 = new Client(new BankAccount(123.00,null),"adad","asdas");
        Client loh6 = new Client(new BankAccount(123.00,null),"adad","asdas");

        loh3.payIn(123123.00);
        loh4.payIn(123123.00);
        loh5.payIn(123123.00);
        loh6.payIn(123123.00);

    }
}
