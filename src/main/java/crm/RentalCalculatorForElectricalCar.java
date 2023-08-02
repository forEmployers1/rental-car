package crm;

import java.math.BigDecimal;

public class RentalCalculatorForElectricalCar implements RentalCalculator {
    @Override
    public BigDecimal calculateAmount(Integer period) {
        return (period > 3) ? BigDecimal.valueOf((period - 2)*15): BigDecimal.valueOf(15);
    }

    @Override
    public int calculateLoyaltyPoints(Integer period) {
        return 1;
    }
}
