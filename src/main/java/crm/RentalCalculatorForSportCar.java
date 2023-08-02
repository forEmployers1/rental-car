package crm;

import java.math.BigDecimal;

public class RentalCalculatorForSportCar implements RentalCalculator{
    @Override
    public BigDecimal calculateAmount(Integer period) {
        return (period > 2) ? BigDecimal.valueOf((period - 1)*30): BigDecimal.valueOf(30);
    }

    @Override
    public int calculateLoyaltyPoints(Integer period) {
        return 1;
    }
}
