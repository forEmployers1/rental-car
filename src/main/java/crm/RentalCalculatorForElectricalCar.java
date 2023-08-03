package crm;

import java.math.BigDecimal;

public class RentalCalculatorForElectricalCar implements RentalCalculator {
    @Override
    public BigDecimal calculateAmount(Rental rental) {
        Integer period = rental.getPeriod();
        return ( period > 3) ? BigDecimal.valueOf(( period- 2)*15): BigDecimal.valueOf(15);
    }

    @Override
    public int calculateLoyaltyPoints(Rental rental) {
        return 1;
    }
}
