package crm;

import lombok.Getter;
import lombok.Setter;

/**
 * Classes for rented items are inherited from this class.
 * It contains a field for an object that implements RentalCalculator interface.
 */

@Getter
@Setter
public abstract class Rented  {
    private RentalCalculator rentalCalculator;

}