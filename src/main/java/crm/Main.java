package crm;

import crm.printer.ConsolePrinter;
import crm.printer.PrinterContext;

import static crm.CarType.*;


public class Main {
    public static final Car FERRARI = new Car("Ferrari F40", SPORT, new RentalCalculatorFactory());
    public static final Car FORD = new Car("Ford Focus", REGULAR, new RentalCalculatorFactory());
    public static final Car TESLA = new Car("Tesla model 3", ELECTRICAL, new RentalCalculatorFactory());

    public static void main(String[] args) {

        Customer customer = new Customer("Vasiliy Pupkin");

        customer.toRent(new Rental(FERRARI, 1));
        customer.toRent(new Rental(FORD, 4));
        customer.toRent(new Rental(TESLA, 5));

        PrinterContext printerContext = new PrinterContext();

        printerContext.setPrinter(new ConsolePrinter());

        printerContext.print(customer);
    }
}
