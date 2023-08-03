package crm;

import java.math.BigDecimal;

public class RentalCalculatorForSportCar implements RentalCalculator{
    @Override
    public BigDecimal calculateAmount(Rental rental) {
        Integer period = rental.getPeriod();
        return (period > 2) ? BigDecimal.valueOf((period - 1)*30): BigDecimal.valueOf(30);
    }

    @Override
    public int calculateLoyaltyPoints(Rental rental) {
        return 1;
    }
}
