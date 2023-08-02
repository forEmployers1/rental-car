package crm.printer;

import crm.Customer;

public class PrinterContext {
    private Printer printer;

    public PrinterContext() {
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void print(Customer customer) {
        printer.print(customer);
    }
}
