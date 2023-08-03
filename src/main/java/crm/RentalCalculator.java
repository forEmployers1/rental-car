package crm;

import java.math.BigDecimal;

public interface RentalCalculator {

    BigDecimal calculateAmount(Rental rental);

    int calculateLoyaltyPoints(Rental rental);
}
