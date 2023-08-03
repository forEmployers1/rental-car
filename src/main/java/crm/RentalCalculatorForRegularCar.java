package crm;

import java.math.BigDecimal;

public class RentalCalculatorForRegularCar implements RentalCalculator {
    @Override
    public BigDecimal calculateAmount(Rental rental) {
        return BigDecimal.valueOf(rental.getPeriod()*10);
    }

    @Override
    public int calculateLoyaltyPoints(Rental rental) {
        return (rental.getPeriod() > 1 ) ? 2 : 1;
    }
}
