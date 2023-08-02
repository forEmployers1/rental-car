package crm.printer;

import crm.Customer;

public class ConsolePrinter implements Printer {

    @Override
    public void print(Customer customer) {
        System.out.println(customer.statement());
    }
}
