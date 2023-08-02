package crm;

import lombok.Getter;

@Getter
public class Car extends Rented {
    private final String title;
    private final CarType priceCode;

    public Car(String title, CarType priceCode, RentalCalculatorFactory rentalCalculatorFactory) {

        super(rentalCalculatorFactory.createRentalCalculator(priceCode));

        this.title = title;
        this.priceCode = priceCode;

    }

    @Override
    public String toString() {
        return '\t' + title;
    }
}
