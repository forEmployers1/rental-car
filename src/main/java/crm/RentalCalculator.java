package crm;

import java.math.BigDecimal;

public interface RentalCalculator {

    BigDecimal calculateAmount(Integer period);

    int calculateLoyaltyPoints(Integer period);
}
