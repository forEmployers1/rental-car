package crm;

import lombok.Getter;

@Getter
public class Car extends Rented {
    private final String title;
    private final CarType priceCode;
    private final RentalCalculatorFactory rentalCalculatorFactory;

    public Car(String title, CarType priceCode, RentalCalculatorFactory rentalCalculatorFactory) {
        this.title = title;
        this.priceCode = priceCode;
        this.rentalCalculatorFactory = rentalCalculatorFactory;
        setRentalCalculator(rentalCalculatorFactory.createRentalCalculator(priceCode));
    }

    @Override
    public String toString() {
        return '\t' + title;
    }
}
