package crm;

import lombok.Getter;

@Getter
public class Car extends Rented {
    private final String title;

    public Car(String title, RentalCalculator rentalCalculator) {

        super(rentalCalculator);

        this.title = title;

    }

    @Override
    public String toString() {
        return '\t' + title;
    }
}
