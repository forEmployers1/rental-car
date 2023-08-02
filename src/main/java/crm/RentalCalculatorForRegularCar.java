package crm;

import java.math.BigDecimal;

public class RentalCalculatorForRegularCar implements RentalCalculator {
    @Override
    public BigDecimal calculateAmount(Integer period) {
        return BigDecimal.valueOf(period*10);
    }

    @Override
    public int calculateLoyaltyPoints(Integer period) {
        return (period > 1 ) ? 2 : 1;
    }
}
